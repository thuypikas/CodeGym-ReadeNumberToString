package com.codegym;

import java.text.NumberFormat;
import java.util.Scanner;

public class ReadNumber {

    public static String[] units = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    public static String[] tens = {
            "",        // 0
            "",        // 1
            "Twenty",    // 2
            "Thirty",    // 3
            "Forty",    // 4
            "Fifty",    // 5
            "Sixty",    // 6
            "Seventy",    // 7
            "Eighty",    // 8
            "Ninety"    // 9
    };

    public static String convert(int n) {
        if (n == 0) {
            return "Zero";
        }
        if (n > 0 && n < 20) {
            return units[n];
        }
        if (n >= 20 && n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }
        if (n % 100 == 0 && n < 1000) {
            return units[n / 100] + " Hundred";
        }
        if (n > 100 && n < 1000) {
            return units[n / 100] + " Hundred And" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
        return "Please input number from 0 to 999";
    }

    public static void main(final String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to convert into word format");
        n = s.nextInt();
        System.out.println(convert(n));

    }
}