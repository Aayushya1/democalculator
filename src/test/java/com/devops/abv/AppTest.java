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
        long result = calculator.addition(a, b);

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testsubt() {
        int a = 15;
        int b = 20;
        int expectedResult = 5;
        long result = calculator.subtraction(a, b);

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testmul() {
        int a = 2;
        int b = 2;
        int expectedResult = 4;
        long result = calculator.multiplication(a, b);

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testdiv() {
        Double a = Double.valueOf(45);
        Double b = Double.valueOf(10);
        double expectedResult = 4.5;
        double result = calculator.division(a,b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
}
