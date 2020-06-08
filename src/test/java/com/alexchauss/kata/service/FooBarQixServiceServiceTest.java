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

    @Test
    public void whenFour_thenFour() {
        // given
        int input = 4;
        String expected = "4";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void whenFive_thenBarBar() {
        // given
        int input = 5;
        String expected = "BarBar";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void whenSix_thenFoo() {
        // given
        int input = 6;
        String expected = "Foo";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void whenSeven_thenQixQix() {
        // given
        int input = 7;
        String expected = "QixQix";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void whenEight_thenEight() {
        // given
        int input = 8;
        String expected = "8";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void whenNine_thenFoo() {
        // given
        int input = 9;
        String expected = "Foo";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void whenTen_thenBar() {
        // given
        int input = 10;
        String expected = "Bar";

        // when
        String result = fooBarQixService.getResult(input);

        // then
        assertThat(result)
                .isEqualTo(expected);
    }
}
