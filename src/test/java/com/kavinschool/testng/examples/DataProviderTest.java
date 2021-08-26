package com.kavinschool.testng.examples;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "alphabetData")
    public Object[][] alphabetData() {
        return new Object[][] {
                {"a", "apple","ant"},
                {"b", "banana","bear"},
                {"c", "cherry","cat"},
                {"d", "date","deer"},
                {"e", "eggplant","elephant"},
                {"f", "fig","fish"},
                {"g", "guava", "goat"}
        };
    }

    @Test(dataProvider = "alphabetData")
    public void testAlphabets(final String letter, final String fruit, final String animal) {
        System.out.println("letter = " + letter + ", fruit = " + fruit + ", animal = " + animal);
        assertTrue(fruit.startsWith(letter), fruit + " starts with " + letter);
        assertTrue(animal.startsWith(letter), animal + " starts with " + letter);
    }
}
