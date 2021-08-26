package com.kavinschool.testng.examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShapesDependsOnMethodTest {

    @Test(groups={"circle","shape"})
    public void testCircle() {
        System.out.println("ShapesDependsOnMethodTest.testCircle");
    }

    @Test(groups={"cuboid","shape"})
    public void testCuboid() {
        System.out.println("ShapesDependsOnMethodTest.testCuboid");
    }

    @Test(groups={"square","shape"})
    public void testSquare() {
        System.out.println("ShapesTest.testSquare");
    }

    @Test(groups={"cube","shape"}, dependsOnMethods = {"testRectangle"})
    public void testCube() {
        System.out.println("ShapesTest.testCube");
    }

    @Test(groups={"rectangle","shape"}, dependsOnMethods = {"testSquare"})
    public void testRectangle() {
        System.out.println("ShapesTest.testRectangle");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.out.println("ShapesDependsOnMethodTest.setUp");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("ShapesDependsOnMethodTest.tearDown");
    }
}


