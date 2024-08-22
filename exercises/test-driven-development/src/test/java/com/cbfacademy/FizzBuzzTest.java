package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class FizzBuzzTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

    @Test
    @DisplayName("prints 1 if the input is 1")
    public void prints1IfInputIs1() {
        assertEquals("1", FizzBuzz.get(1));
    }

    @Test
    @DisplayName("prints 2 if the input is 2")
    public void prints2IfInputIs2() {
        assertEquals("2", FizzBuzz.get(2));
    }

    @Test
    @DisplayName("prints Fizz if the input is 3")
    public void printsFizzIfInputIs3() {
        assertEquals("Fizz", FizzBuzz.get(3));

    }

    @Test
    @DisplayName("prints Fizz if the input is 6")
    public void printsFizzIfInputIs6() {
        assertEquals("Fizz", FizzBuzz.get(6));
    }

    @Test
    @DisplayName("prints Fizz if the input is 9")
    public void printsFizzIfInputIs9() {
        assertEquals("Fizz", FizzBuzz.get(9));
    }

    @Test
    @DisplayName("prints Buzz if the input is 5")
    public void printsBuzzIfInputIs5() {
        assertEquals("Buzz", FizzBuzz.get(5));
    }

    @Test
    @DisplayName("prints Buzz if the input is 10")
    public void printsBuzzIfInputIs10() {
        assertEquals("Buzz", FizzBuzz.get(10));
    }

    @Test
    @DisplayName("prints FizzBuzz if the input is 15")
    public void printsFizzBuzzIfInputIs15() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }

    @Test
    @DisplayName("prints FizzBuzz if the input is 30")
    public void printsFizzBuzzIfInputIs30() {
        assertEquals("FizzBuzz", FizzBuzz.get(30));
    }

    //Edge Cases
    @Test
    @DisplayName("prints FizzBuzz if the input is 0")
    public void printsFizzBuzzIfInputIs0() {
        assertEquals("FizzBuzz", FizzBuzz.get(0));
    }

    @Test
    @DisplayName("prints -1 if the input is -1")
    public void printsNegative1IfInputIsNegative1() {
        assertEquals("-1", FizzBuzz.get(-1));
    }

    @Test
    @DisplayName("prints Fizz if the input is -3")
    public void printsFizzIfInputIsNegative3() {
        assertEquals("Fizz", FizzBuzz.get(-3));
    }

    @Test
    @DisplayName("prints Fizz if the input is -5")
    public void printsBuzzIfInputIsNegative5() {
        assertEquals("Buzz", FizzBuzz.get(-5));
    }

    @Test
    @DisplayName("prints FizzBuzz if the input is -15")
    public void printsFizzBuzzIfInputIsNegative15() {
        assertEquals("FizzBuzz", FizzBuzz.get(-15));
    }

}