package com.oocode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalorieCountingTest {
    @Test
    @Disabled
    public void maxCalories() {
        String input = """
1000
2000
3000

4000

5000
6000

7000
8000
9000
                       
10000
""";
        assertThat(new CalorieCounting().answer(input), equalTo(24000));
    }

    @Test
    public void maxCaloriesOneElfOneItem() {
        assertThat(new CalorieCounting().answer("1000"), equalTo(1000));
        assertThat(new CalorieCounting().answer("2000"), equalTo(2000));
    }

    @Test
    public void maxCaloriesOneElfTwoItems() {
        assertThat(new CalorieCounting().answer("""
                1000
                2000""" ), equalTo(3000));
    }
}
