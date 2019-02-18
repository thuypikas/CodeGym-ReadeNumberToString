package com.codegym;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestReadNumber {
    private ReadNumber readNumber;

    @Before
    public void beforeTest() {
        readNumber = new ReadNumber();
    }

    @Test
    public void testNumberEqual0() {
        String actual = readNumber.convert(0);
        String expected = "Zero";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual1() {
        String actual = readNumber.convert(1);
        String expected = "One";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual2() {
        String actual = readNumber.convert(2);
        String expected = "Two";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual3() {
        String actual = readNumber.convert(3);
        String expected = "Three";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual4() {
        String actual = readNumber.convert(4);
        String expected = "Four";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual5() {
        String actual = readNumber.convert(5);
        String expected = "Five";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual6() {
        String actual = readNumber.convert(6);
        String expected = "Six";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual7() {
        String actual = readNumber.convert(7);
        String expected = "Seven";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual8() {
        String actual = readNumber.convert(8);
        String expected = "Eight";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual9() {
        String actual = readNumber.convert(9);
        String expected = "Nine";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual10() {
        String actual = readNumber.convert(10);
        String expected = "Ten";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual11() {
        String actual = readNumber.convert(11);
        String expected = "Eleven";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual12() {
        String actual = readNumber.convert(12);
        String expected = "Twelve";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual13() {
        String actual = readNumber.convert(13);
        String expected = "Thirteen";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual14() {
        String actual = readNumber.convert(14);
        String expected = "Fourteen";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual15() {
        String actual = readNumber.convert(15);
        String expected = "Fifteen";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual16() {
        String actual = readNumber.convert(16);
        String expected = "Sixteen";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual17() {
        String actual = readNumber.convert(17);
        String expected = "Seventeen";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual18() {
        String actual = readNumber.convert(18);
        String expected = "Eighteen";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual19() {
        String actual = readNumber.convert(19);
        String expected = "Nineteen";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual20() {
        String actual = readNumber.convert(20);
        String expected = "Twenty";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual25() {
        String actual = readNumber.convert(25);
        String expected = "Twenty Five";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual30() {
        String actual = readNumber.convert(30);
        String expected = "Thirty";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual40() {
        String actual = readNumber.convert(40);
        String expected = "Forty";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual50() {
        String actual = readNumber.convert(50);
        String expected = "Fifty";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual60() {
        String actual = readNumber.convert(60);
        String expected = "Sixty";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual70() {
        String actual = readNumber.convert(70);
        String expected = "Seventy";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual80() {
        String actual = readNumber.convert(80);
        String expected = "Eighty";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual90() {
        String actual = readNumber.convert(90);
        String expected = "Ninety";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual100() {
        String actual = readNumber.convert(100);
        String expected = "One Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual105() {
        String actual = readNumber.convert(105);
        String expected = "One Hundred And Five";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual165() {
        String actual = readNumber.convert(165);
        String expected = "One Hundred And Sixty Five";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual200() {
        String actual = readNumber.convert(200);
        String expected = "Two Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual300() {
        String actual = readNumber.convert(300);
        String expected = "Three Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual400() {
        String actual = readNumber.convert(400);
        String expected = "Four Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual500() {
        String actual = readNumber.convert(500);
        String expected = "Five Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual600() {
        String actual = readNumber.convert(600);
        String expected = "Six Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual700() {
        String actual = readNumber.convert(700);
        String expected = "Seven Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual800() {
        String actual = readNumber.convert(800);
        String expected = "Eight Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual900() {
        String actual = readNumber.convert(900);
        String expected = "Nine Hundred";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testNumberEqual999() {
        String actual = readNumber.convert(999);
        String expected = "Nine Hundred And Ninety Nine";
        Assert.assertEquals(actual, expected);
    }

}
