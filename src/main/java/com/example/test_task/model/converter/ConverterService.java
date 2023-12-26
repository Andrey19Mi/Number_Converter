package com.example.test_task.model.converter;

import com.example.test_task.model.dictionary.Dictionary;
import com.example.test_task.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class ConverterService {

    @Autowired
    private ConverterRepository converterRepository;
    @Autowired
    private UserRepository userRepository;

    public String convert(String type, String input, Authentication authentication) {
        String output = "";

        if (type.equals("StringToNumber")){
            output = convertToNumber(input);
        } else if (type.equals("NumberToString")){
            output = convertToString(input);
        } else {
            throw new RuntimeException("такой команды не существует");
        }

        saveLog(authentication.getName(), type, input, output);
        return output;
    }

    private String convertToNumber(String input) {
        input = input.toLowerCase();
        String[] wordsArray = input.split("\\s+");
        Map<String, Long> dict = Dictionary.getStrToNumb();

        if (input.isEmpty()){
            return "0";
        }

        long result = 0L;
        long currentNumber = 0L;
        for(String word : wordsArray){
            long item = dict.get(word);

            if (currentNumber != 0 && (item == 1000 || item == 1000000 || item == 1000000000)){
                currentNumber *= item;
                result += currentNumber;
                currentNumber = 0L;
            } else {
                currentNumber += item;
            }
        }
        result += currentNumber;
        return String.valueOf(result);
    }

    private String convertToString(String input) {
        long value = Long.parseLong(input.replaceAll("\\s", ""));
        Map<Long, String> dict;
        ArrayList<String> res = new ArrayList<>();

        if (isRussian(input)){
            dict = Dictionary.getRusStrings();
        } else {
            dict = Dictionary.getEngStrings();
        }

        long i = 1L;
        do {
            int segment = 0;
            if (value >= 100) {
                String str = String.valueOf(value);
                segment = Integer.parseInt(str.substring(str.length() - 3));
            } else {
                segment = (int) value;
            }
            value /= 1000L;
            int i2 = 1;
            LinkedList<String> strSegment = new LinkedList<>();
            if (segment % 100 >= 10 && segment % 100 <= 19) {
                strSegment.add(0, dict.get(segment % 100L));
                segment /= 100;
                i2 *= 100;
            }
            while (segment > 0) {
                if (segment % 10L != 0L) {
                    strSegment.add(0, dict.get(segment % 10L * i2));
                }
                segment /= 10;
                i2 *= 10;
            }
            if (i != 1L && !strSegment.isEmpty()) {
                res.add(0, dict.get(i));
                res.addAll(0, strSegment);
            } else {
                res.addAll(0, strSegment);
            }
            i *= 1000L;
        } while (value > 0);

        if (isRussian(input)){
            List<String> str1 = List.of("два", "три", "четыре");
            List<String> str2 = List.of("миллион", "миллиард");

            for (int j = 0; j < res.size() - 1; j++) {
                if (res.get(j).equals("один") && res.get(j + 1).equals("тысяч")) {
                    res.set(j, "одна");
                    res.set(j + 1, "тысяча");
                } else if (str1.contains(res.get(j)) && res.get(j + 1).equals("тысяч")) {
                    if (res.get(j).equals("два")) {
                        res.set(j, "две");
                    }
                    res.set(j + 1, "тысячи");
                } else if (str1.contains(res.get(j)) && str2.contains(res.get(j + 1))) {
                    String word = res.get(j + 1);
                    res.set(j + 1, word + "а");
                } else if (!str1.contains(res.get(j)) && str2.contains(res.get(j + 1)) && !res.get(j).equals("один")) {
                    String word = res.get(j + 1);
                    res.set(j + 1, word + "ов");
                }
            }
        }

        return String.join(" ", res);
    }

    private boolean isRussian(String string) {
        string = string.replace(" ", "");
        char firstChar = string.charAt(0);

        if (192 <= firstChar && firstChar <= 255) {
            return true;
        } else if (41 <= firstChar && firstChar <= 122) {
            return false;
        } else {
            throw new RuntimeException("данный язык/набор символов не поодерживается");
        }
    }

    private void saveLog(String username, String type, String input, String output) {
        Converter converter = new Converter(
                userRepository.findByUsername(username).get(),
                type,
                input,
                output,
                LocalDateTime.now()
        );
        converterRepository.save(converter);
    }
}
