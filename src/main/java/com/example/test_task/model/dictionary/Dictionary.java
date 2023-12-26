package com.example.test_task.model.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final static Map<String, Long> NUMBERS;
    private final static Map<Long, String> RUS_STRINGS;
    private final static Map<Long, String> ENG_STRINGS;


    static {
        Map<String, Long> wordDict = new HashMap<>();
        wordDict.put("zero", 0L);
        wordDict.put("one", 1L);
        wordDict.put("two", 2L);
        wordDict.put("three", 3L);
        wordDict.put("four", 4L);
        wordDict.put("five", 5L);
        wordDict.put("six", 6L);
        wordDict.put("seven", 7L);
        wordDict.put("eight", 8L);
        wordDict.put("nine", 9L);
        wordDict.put("ten", 10L);
        wordDict.put("eleven", 11L);
        wordDict.put("twelve", 12L);
        wordDict.put("thirteen", 13L);
        wordDict.put("fourteen", 14L);
        wordDict.put("fifteen", 15L);
        wordDict.put("sixteen", 16L);
        wordDict.put("seventeen", 17L);
        wordDict.put("eighteen", 18L);
        wordDict.put("nineteen", 19L);
        wordDict.put("twenty", 20L);
        wordDict.put("thirty", 30L);
        wordDict.put("forty", 40L);
        wordDict.put("fifty", 50L);
        wordDict.put("sixty", 60L);
        wordDict.put("seventy", 70L);
        wordDict.put("eighty", 80L);
        wordDict.put("ninety", 90L);
        wordDict.put("hundred", 100L);
        wordDict.put("thousand", 1000L);
        wordDict.put("million", 1000000L);
        wordDict.put("billion", 1000000000L);

        wordDict.put("ноль", 0L);
        wordDict.put("один", 1L);
        wordDict.put("одна", 1L);
        wordDict.put("два", 2L);
        wordDict.put("две", 2L);
        wordDict.put("три", 3L);
        wordDict.put("четыре", 4L);
        wordDict.put("пять", 5L);
        wordDict.put("шесть", 6L);
        wordDict.put("семь", 7L);
        wordDict.put("восемь", 8L);
        wordDict.put("девять", 9L);
        wordDict.put("десять", 10L);
        wordDict.put("одиннадцать", 11L);
        wordDict.put("двенадцать", 12L);
        wordDict.put("тринадцать", 13L);
        wordDict.put("четырнадцать", 14L);
        wordDict.put("пятнадцать", 15L);
        wordDict.put("шестнадцать", 16L);
        wordDict.put("семнадцать", 17L);
        wordDict.put("восемнадцать", 18L);
        wordDict.put("девятнадцать", 19L);
        wordDict.put("двадцать", 20L);
        wordDict.put("тридцать", 30L);
        wordDict.put("сорок", 40L);
        wordDict.put("пятьдесят", 50L);
        wordDict.put("шестьдесят", 60L);
        wordDict.put("семьдесят", 70L);
        wordDict.put("восемьдесят", 80L);
        wordDict.put("девяносто", 90L);
        wordDict.put("сто", 100L);
        wordDict.put("двести", 200L);
        wordDict.put("триста", 300L);
        wordDict.put("четыреста", 400L);
        wordDict.put("пятьсот", 500L);
        wordDict.put("шестьсот", 600L);
        wordDict.put("семьсот", 700L);
        wordDict.put("восемьсот", 800L);
        wordDict.put("девятьсот", 900L);
        wordDict.put("тысяча", 1000L);
        wordDict.put("тысяч", 1000L);
        wordDict.put("тысячи", 1000L);
        wordDict.put("миллион", 1000000L);
        wordDict.put("миллиона", 1000000L);
        wordDict.put("миллионов", 1000000L);
        wordDict.put("миллиард", 1000000000L);
        wordDict.put("миллиарда", 1000000000L);
        wordDict.put("миллиардов", 1000000000L);

        NUMBERS = wordDict;
    }

    static {
        Map<Long, String> wordDict = new HashMap<>();
        wordDict.put(0L, "ноль");
        wordDict.put(1L, "один");
        wordDict.put(2L, "два");
        wordDict.put(3L, "три");
        wordDict.put(4L, "четыре");
        wordDict.put(5L, "пять");
        wordDict.put(6L, "шесть");
        wordDict.put(7L, "семь");
        wordDict.put(8L, "восемь");
        wordDict.put(9L, "девять");
        wordDict.put(10L, "десять");
        wordDict.put(11L, "одиннадцать");
        wordDict.put(12L, "двенадцать");
        wordDict.put(13L, "тринадцать");
        wordDict.put(14L, "четырнадцать");
        wordDict.put(15L, "пятнадцать");
        wordDict.put(16L, "шестнадцать");
        wordDict.put(17L, "семнадцать");
        wordDict.put(18L, "восемнадцать");
        wordDict.put(19L, "девятнадцать");
        wordDict.put(20L, "двадцать");
        wordDict.put(30L, "тридцать");
        wordDict.put(40L, "сорок");
        wordDict.put(50L, "пятьдесят");
        wordDict.put(60L, "шестьдесят");
        wordDict.put(70L, "семьдесят");
        wordDict.put(80L, "восемьдесят");
        wordDict.put(90L, "девяносто");
        wordDict.put(100L, "сто");
        wordDict.put(200L, "двести");
        wordDict.put(300L, "триста");
        wordDict.put(400L, "четыреста");
        wordDict.put(500L, "пятьсот");
        wordDict.put(600L, "шестьсот");
        wordDict.put(700L, "семьсот");
        wordDict.put(800L, "восемьсот");
        wordDict.put(900L, "девятьсот");
        wordDict.put(1000L, "тысяч");
        wordDict.put(1000000L, "миллион");
        wordDict.put(1000000000L, "миллиард");
        RUS_STRINGS = wordDict;
    }

    static {
        Map<Long, String> wordDict = new HashMap<>();
        wordDict.put(0L, "zero");
        wordDict.put(1L, "one");
        wordDict.put(2L, "two");
        wordDict.put(3L, "three");
        wordDict.put(4L, "four");
        wordDict.put(5L, "five");
        wordDict.put(6L, "six");
        wordDict.put(7L, "seven");
        wordDict.put(8L, "eight");
        wordDict.put(9L, "nine");
        wordDict.put(10L, "ten");
        wordDict.put(11L, "eleven");
        wordDict.put(12L, "twelve");
        wordDict.put(13L, "thirteen");
        wordDict.put(14L, "fourteen");
        wordDict.put(15L, "fifteen");
        wordDict.put(16L, "sixteen");
        wordDict.put(17L, "seventeen");
        wordDict.put(18L, "eighteen");
        wordDict.put(19L, "nineteen");
        wordDict.put(20L, "twenty");
        wordDict.put(30L, "thirty");
        wordDict.put(40L, "forty");
        wordDict.put(50L, "fifty");
        wordDict.put(60L, "sixty");
        wordDict.put(70L, "seventy");
        wordDict.put(80L, "eighty");
        wordDict.put(90L, "ninety");
        wordDict.put(100L, "one hundred");
        wordDict.put(200L, "two hundred");
        wordDict.put(300L, "three hundred");
        wordDict.put(400L, "four hundred");
        wordDict.put(500L, "five hundred");
        wordDict.put(600L, "six hundred");
        wordDict.put(700L, "seven hundred");
        wordDict.put(800L, "eight hundred");
        wordDict.put(900L, "nine hundred");
        wordDict.put(1000L, "thousand");
        wordDict.put(1000000L, "million");
        wordDict.put(1000000000L, "billion");
        ENG_STRINGS = wordDict;
    }

    private Dictionary(){}

    public static Map<String, Long> getStrToNumb(){
        return NUMBERS;
    }

    public static Map<Long, String> getRusStrings(){
        return RUS_STRINGS;
    }

    public static Map<Long, String> getEngStrings() {return ENG_STRINGS;}
}
