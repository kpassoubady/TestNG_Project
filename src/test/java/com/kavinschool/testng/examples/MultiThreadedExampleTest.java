package com.kavinschool.testng.examples;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.Test;

public class MultiThreadedExampleTest {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void testRandomNumbers() {
        long threadId = Thread.currentThread().getId();
        System.out.println("threadId = " + threadId);
        Random rand = new Random();
        int currentRand = rand.nextInt(25);
        System.out.println("currentRand = " + currentRand);
        assertTrue(currentRand > 12, "Greater than 12" );
    }

    @Test(invocationCount = 10, invocationTimeOut = 10000)
    public void testRandomNumbersWithDelay() throws InterruptedException {
        long threadId = Thread.currentThread().getId();
        System.out.println("threadId = " + threadId);
        Random rand = new Random();
        int currentRand = rand.nextInt(10);
        System.out.println("currentRand = " + currentRand);
        Thread.sleep(currentRand * 1000);
        assertTrue(currentRand > 6, "Greater than 6" );
    }
}
