package com.oocode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CalorieCounting {
    public int answer(String  input) throws IllegalArgumentException {
        String[] arrElves = input.split("\n\n");
        return Arrays.stream(arrElves).map(s -> s.split("\n"))
                .map(arrCalories -> Arrays.stream(arrCalories)
                        .map(Integer::parseInt)
                        .peek(item -> {
                            if (item < 0) {
                                throw  new IllegalArgumentException("Cannot be negative");
                            }
                        })
                        .reduce(0, Integer::sum))
                .reduce(0, Integer::max);
    }

    public int answer2(String  input) throws IllegalArgumentException {
        String[] arrElves = input.split("\n\n");
        return Arrays.stream(arrElves).map(s -> s.split("\n"))
                .map(arrCalories -> Arrays.stream(arrCalories)
                        .map(Integer::parseInt)
                        .peek(item -> {
                            if (item < 0) {
                                throw  new IllegalArgumentException("Cannot be negative");
                            }
                        })
                        .reduce(0, Integer::sum))
                .sorted()
                .collect(Collectors.toList())
                .reversed()
                .subList(0,3)
                .stream()
                .reduce(0, Integer::sum);
    }
}
