package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("LeapYearTest")
public class LeapYearTest

{

    @Test
    @DisplayName("returns true if input is 400")
    public void returnsTrueIfInputIs400() {
        assertEquals(true, LeapYear.get(400));
    }

    @Test
    @DisplayName("returns true if input is 2000")
    public void returnsTrueIfInputIs2000() {
        assertEquals(true, LeapYear.get(2000));
    }

    @Test
    @DisplayName("returns false if input is 3001")
    public void returnsFalseIfInputIs3001() {
        assertEquals(false, LeapYear.get(3001));
    }

    @Test
    @DisplayName("returns false if input is 1700")
    public void returnsFalseIfInputIs1700() {
        assertEquals(false, LeapYear.get(1700));
    }

    @Test
    @DisplayName("returns true if input is 2004")
    public void returnsTrueIfInputIs2004() {
        assertEquals(true, LeapYear.get(2004));
    }

    @Test
    @DisplayName("returns false if input is 1800")
    public void returnsFalseIfInputIs2004() {
        assertEquals(false, LeapYear.get(1800));
    }

    @Test
    @DisplayName("returns false if input is 2003")
    public void returnsFalseIfInputIs2003() {
        assertEquals(false, LeapYear.get(2003));
    }

}