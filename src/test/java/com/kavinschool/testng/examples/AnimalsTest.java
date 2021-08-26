package com.kavinschool.testng.examples;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnimalsTest {

    @Test(groups = {"ant","animal"}, priority = 30)
    public void testAnt() {
        System.out.println("AnimalsTest.testAnt");
        assertEquals("Ant","Bant", "Animal Comparison");
        Assert.assertTrue(5 > 10, "Number comparison");
    }

    @Test(groups = {"bear","animal"}, priority = 0)
    public void testBear() {
        System.out.println("AnimalsTest.testBear");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Ant","Bear", "Animal Comparison");
        //softAssert.assertEquals("Apple", "Apple", "Apple Fruit comparison");
        //softAssert.assertEquals("Berry", "GooseBerry", "Berry Fruit comparison ");
        softAssert.assertEquals("Apple", "Apple");
        softAssert.assertEquals("Berry", "GooseBerry");
        softAssert.assertEquals(10, 20, "Number Comparison");
        softAssert.assertAll();
    }

    @Test(groups = {"cat","animal"}, priority = 10)
    public void testCat() {
        System.out.println("AnimalsTest.testCat");
    }
}
