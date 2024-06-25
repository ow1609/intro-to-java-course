package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        List<String> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) % 3 == 0) && (numbers.get(i) % 5 == 0)) {
                result.add("FizzBuzz");
            } else if (numbers.get(i) % 3 == 0) {
                result.add("Fizz");
            } else if (numbers.get(i) % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(numbers.get(i).toString());
            }
        }
        return result;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        List<String> months = new ArrayList<>();
            months.add("January");
            months.add("February");
            months.add("March");
            months.add("April");
            months.add("May");
            months.add("June");
            months.add("July");
            months.add("August");
            months.add("September");
            months.add("October");
            months.add("November");
            months.add("December");

        if ((number >= 1) && (number <= 12)) {
            return months.get(number - 1);
        } else {
            return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        List<Integer> numbers1to100 = new ArrayList<>();
        for (int i = 1 ; i <= 100 ; i++) {
            numbers1to100.add(i);
        }
        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (int i = 0; i < numbers1to100.size(); i++) {
            if (numbers1to100.get(i) % 2 == 0) {
                sumOfEvens += numbers1to100.get(i);
            } else {
                sumOfOdds += numbers1to100.get(i);
            }}

        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfEvens", sumOfEvens);
        result.put("SumOfOdds", sumOfOdds);

        return result;
        }

        
    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        Collections.reverse(numbers);
        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
