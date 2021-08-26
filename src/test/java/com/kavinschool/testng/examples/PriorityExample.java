package com.kavinschool.testng.examples;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 20)
    public void testDog() {
        System.out.println("PriorityExample.testDog");
    }

    @Test(priority = -10)
    public void testZebra() {
        System.out.println("PriorityExample.testZebra");
    }

    @Test(priority = 10)
    public void testCobra() {
        System.out.println("PriorityExample.testCobra");
    }

}
