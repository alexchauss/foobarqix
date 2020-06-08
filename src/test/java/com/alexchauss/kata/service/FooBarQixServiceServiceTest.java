package com.alexchauss.kata.service;

import com.alexchauss.kata.service.impl.FooBarQixServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooBarQixServiceServiceTest {

    private FooBarQixService fooBarQixService = new FooBarQixServiceImpl();

    @Test
    public void should_One_When_One() {
        // arrange
        int input = 1;
        String expected = "1";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_Two_When_Two() {
        // arrange
        int input = 2;
        String expected = "2";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_FooFoo_WhenThree() {
        // arrange
        int input = 3;
        String expected = "FooFoo";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_Four_When_Four() {
        // arrange
        int input = 4;
        String expected = "4";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_BarBar_When_Five() {
        // arrange
        int input = 5;
        String expected = "BarBar";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // arrange
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_Foo_When_Six() {
        // arrange
        int input = 6;
        String expected = "Foo";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_QixQix_When_Seven() {
        // arrange
        int input = 7;
        String expected = "QixQix";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_Eight_When_Eight() {
        // arrange
        int input = 8;
        String expected = "8";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_Foo_When_Nine() {
        // arrange
        int input = 9;
        String expected = "Foo";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_Bar_When_Ten() {
        // arrange
        int input = 10;
        String expected = "Bar";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    public void should_Foo_When_Thirteen() {
        // arrange
        int input = 13;
        String expected = "Foo";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_FooBarBar_When_Fifteen() {
        // arrange
        int input = 15;
        String expected = "FooBarBar";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_FooQix_When_TwentyOne() {
        // arrange
        int input = 21;
        String expected = "FooQix";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_FooFooFoo_When_ThirtyThree() {
        // arrange
        int input = 33;
        String expected = "FooFooFoo";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_FooBar_When_FiftyOne() {
        // arrange
        int input = 51;
        String expected = "FooBar";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_BarFoo_When_FiftyThree() {
        // arrange
        int input = 53;
        String expected = "BarFoo";

        // act
        String result = fooBarQixService.getFooBarQix(input);

        // assert
        assertThat(result).isEqualTo(expected);
    }

}
