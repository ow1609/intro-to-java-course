package com.cbfacademy;

public class LeapYear {

    public static Boolean get(Integer number) {
    // if number is divisible by 100 and not divisible by 400 OR if the number is divisble by 4 and not divisible by 100
        if ((number % 100 == 0 && number % 400 == 0) || (number % 4 == 0 && number % 100 != 0)) {
            return true;
        } else {
            return false;
        }
}

}

