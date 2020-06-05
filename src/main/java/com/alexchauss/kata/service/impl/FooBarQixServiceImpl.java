package com.alexchauss.kata.service.impl;

import com.alexchauss.kata.service.FooBarQixService;
import org.springframework.stereotype.Service;

@Service
public class FooBarQixServiceImpl implements FooBarQixService {
    @Override
    public String getResult(int input) {
        return String.valueOf(input);
    }
}
