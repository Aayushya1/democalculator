package com.devops.abv;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private App calculator;

    @Before
    public void setUp() {
        calculator = new App();
    }
    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        int result = calculator.addition(a, b);

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testsub() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        int result = calculator.subtraction(a, b);

        Assert.assertEquals(expectedResult, result);
    }
}
