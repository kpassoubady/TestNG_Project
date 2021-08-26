package com.kavinschool.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderExecutionTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("OrderExecutionTest.beforeClass");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("OrderExecutionTest.setUp");
    }

    @Test(groups = {"apple","fruit"})
    public void testApple() {
        System.out.println("OrderExecutionTest.testApple");
    }

    @Test(groups = {"banana","fruit"})
    public void testBanana() {
        System.out.println("OrderExecutionTest.testBanana");
    }

    @Test(groups = {"cherry","fruit"})
    public void testCherry() {
        System.out.println("OrderExecutionTest.testCherry");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("OrderExecutionTest.tearDown");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("OrderExecutionTest.afterClass");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("OrderExecutionTest.afterSuite");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("OrderExecutionTest.beforeSuite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("OrderExecutionTest.afterTest");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("OrderExecutionTest.beforeTest");
    }
}
