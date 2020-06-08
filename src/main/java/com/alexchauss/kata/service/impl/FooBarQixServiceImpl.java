package com.alexchauss.kata.service.impl;

import com.alexchauss.kata.service.FooBarQixService;
import org.springframework.stereotype.Service;

@Service
public class FooBarQixServiceImpl implements FooBarQixService {

    final String FOO = "Foo";
    final String BAR = "Bar";
    final String QIX = "Qix";
    final String THREE = "3";
    final String FIVE = "5";
    final String SEVEN = "7";

    @Override
    public String getResult(int input) {

        StringBuilder sb = new StringBuilder();
        final String inputToStr = String.valueOf(input);

        checkDivisibility(input, sb);

        checkOccurences(inputToStr, sb);

        if(sb.length() == 0) {
            return inputToStr;
        }

        return sb.toString();
    }

    private void checkDivisibility(int input, StringBuilder sb) {
        if(input % 3 == 0) {
            sb.append(FOO);
        }
        if(input % 5 == 0) {
            sb.append(BAR);
        }
        if(input % 7 == 0) {
            sb.append(QIX);
        }
    }

    private void checkOccurences(String inputToStr, StringBuilder sb) {
        for(char digit : inputToStr.toCharArray()) {
            if(String.valueOf(digit).equals(THREE)) {
                sb.append(FOO);
            }
            if(String.valueOf(digit).equals(FIVE)) {
                sb.append(BAR);
            }
            if(String.valueOf(digit).equals(SEVEN)) {
                sb.append(QIX);
            }
        }
    }

}
