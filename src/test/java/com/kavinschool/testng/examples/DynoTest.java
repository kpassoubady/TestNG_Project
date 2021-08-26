package com.kavinschool.testng.examples;

import org.testng.annotations.Test;

public class DynoTest {

    @Test(groups = {"raptor","dyno"})
    public void testRaptor() {
        System.out.println("DynoTest.testRaptor");
    }

    @Test(groups = {"stego","dyno"})
    public void testStegosaurus() {
        System.out.println("DynoTest.testStegosaurus");
    }

    @Test(groups = {"bronto","dyno"})
    public void testBrontosaurus() {
        System.out.println("DynoTest.testBrontosaurus");
        int badri = 100;
        int kangs = 0;

        System.out.println("kangs = " + kangs);
        System.out.println("badri = " + badri);

        int loanWeekly = badri/kangs;

        System.out.println("loanWeekly = " + loanWeekly);
    }

    @Test(groups = {"tyran","dyno"}, expectedExceptions = ArithmeticException.class)
    public void testTyrannosaurus() {
        System.out.println("DynoTest.testTyrannosaurus");
        int badri = 100;
        int kangs = 0;

        System.out.println("kangs = " + kangs);
        System.out.println("badri = " + badri);

        int loanWeekly = badri/kangs;

        System.out.println("loanWeekly = " + loanWeekly);
    }
}