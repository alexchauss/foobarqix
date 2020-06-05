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

    @Test
    public void whenTwo_thenTwo() {
        // given
        int input = 2;
        String expected = "2";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void whenThree_thenFooFoo() {
        // given
        int input = 3;
        String expected = "FooFoo";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }
}
