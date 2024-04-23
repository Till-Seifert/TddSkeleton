package com.oocode;

import java.util.Arrays;

public class CalorieCounting { public int answer(String  input) {
        //return Integer.parseInt(input);
        String[] arrCalories = input.split("\n");
        return  Arrays.stream(arrCalories).map(Integer::parseInt).reduce(0, Integer::sum);
    }
}
