package com.alexchauss.kata.service.impl;

import com.alexchauss.kata.service.FooBarQixService;
import org.springframework.stereotype.Service;

@Service
public class FooBarQixServiceImpl implements FooBarQixService {

    final String FOO = "Foo";
    final String THREE = "3";

    @Override
    public String getResult(int input) {

        StringBuilder sb = new StringBuilder();
        final String inputToStr = String.valueOf(input);

        if(input % 3 == 0) {
            sb.append(FOO);
        }
        if(inputToStr.contains(THREE)) {
            sb.append(FOO);
        }

        if(sb.length() == 0) {
            return inputToStr;
        }

        return sb.toString();
    }
}
