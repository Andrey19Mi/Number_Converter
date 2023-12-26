package com.example.test_task.model.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ConverterController {

    private final ConverterService converterService;

    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    @GetMapping("/convert")
    public String convert(@RequestParam String type, @RequestParam String value,
                          @RequestParam(required = false) String lang, Authentication authentication){

        return converterService.convert(type,value, authentication, lang);
    }
}
