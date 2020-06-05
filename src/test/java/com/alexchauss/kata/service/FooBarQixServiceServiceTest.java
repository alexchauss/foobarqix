package com.alexchauss.kata.service;

import com.alexchauss.kata.service.impl.FooBarQixServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;

public class FooBarQixServiceServiceTest {

    private FooBarQixService fooBarQixService = new FooBarQixServiceImpl();

    @Test
    public void whenOne_thenOne() {
        // given
        int input = 1;
        String expected = "1";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }
}
