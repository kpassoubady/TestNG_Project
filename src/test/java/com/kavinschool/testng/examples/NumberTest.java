package com.kavinschool.testng.examples;

import org.testng.annotations.Test;


@Test(groups={"Numbers","NumberTest"})
public class NumberTest {

    @Test
    public void testFirst() {
        System.out.println("SampleTest.testFirst");
    }

    //@Test
    public void testSecond() {
        System.out.println("SampleTest.testSecond");
    }

    @Test(enabled = false)
    public void testThird() {
        System.out.println("SampleTest.testThird");
    }

    @Test(enabled = true)
    public void testFourth() {
        System.out.println("NumberTest.testFourth");
    }

    private static void testStatic() {
        System.out.println("NumberTest.testStatic");
    }
}
