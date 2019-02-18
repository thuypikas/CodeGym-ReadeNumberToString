package com.codegym;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestReadNumber {
    private  ReadNumber readNumber;

    @Before
    public void beforeTest() {
        readNumber  = new ReadNumber();
    }

    // Check n < 0 || n > 999
    @Test
    public void testNumberLess0() {
        String actual = readNumber.convert(-1);
        String expected = "Please input number from 0 to 999";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testNumberBigger999() {
        String actual = readNumber.convert(1000);
        String expected = "Please input number from 0 to 999";
        Assert.assertEquals(actual,expected);
    }

    //Check n==0
    @Test
    public void testNumberEqual0() {
        String actual = readNumber.convert(0);
        String expected = "Zero";
        Assert.assertEquals(actual,expected);
    }

    //Check n >0 && n < 20
    @Test
    public void testNumberEqual5() {
        String actual = readNumber.convert(5);
        String expected = "Five";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testNumberEqual11() {
        String actual = readNumber.convert(11);
        String expected = "Eleven";
        Assert.assertEquals(actual,expected);
    }

    //Check n >= 20 && n < 100
    @Test
    public void testNumberEqual20() {
        String actual = readNumber.convert(20);
        String expected = "Twenty";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testNumberEqual99() {
        String actual = readNumber.convert(99);
        String expected = "Ninety Nine";
        Assert.assertEquals(actual,expected);
    }

    //Check n >= 100 && n < 1000
    @Test
    public void testNumberEqual101() {
        String actual = readNumber.convert(101);
        String expected = "One Hundred One";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testNumberEqual100() {
        String actual = readNumber.convert(100);
        String expected = "One Hundred";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testNumberEqual999() {
        String actual = readNumber.convert(999);
        String expected = "Nine Hundred Ninety Nine";
        Assert.assertEquals(actual,expected);
    }
}
