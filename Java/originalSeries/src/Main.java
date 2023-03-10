package com.NitkarshChourasia;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//        scanner scanned = new scanner(System.in);
//
//        System.out.print("Please enter your principal amount: ");
//        double principal = scanned.next();
//        System.out.println();
//
//        System.out.print("Please enter your rate of interest: ");
//        double rate = scanned.next();
//        System.out.println();
//
//        System.out.print("Please enter your loan duration in years: ");
//        double time = scanned.next();
//        System.out.println();
//
//        double time = time * 12;
//        double rate = (rate / 100) / 12;
//        double monthlyPayment = principal(rate(math.pow((1 + rate), time))) / (math.pow((1 + rate), time) - 1);
//        double monthyPayment = (principal * rate * Math.pow((1 + rate), time)) / (Math.pow((1 + rate), time) - 1);
//        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.INDIA);
//        String result = currency.format(monthlyPayment);
//        System.out.println("Your monthly payment is: " + result);
        // Build a mortgage calculator.

        Scanner scanner = new scanner(System.in);
        System.out.print("Please enter your principal amount: ");
        float principal =  scanner.nextfloat();
        System.out.println();
        System.out.print("Please enter your rate of interest: ");
        float rate = scanner.nextfloat();
        System.out.println();
        System.out.print("Please enter your loan duration in years: ");
        float time = scanner.nextfloat();
        System.out.println();
        float timeInMonths = time * 12;
        float rateInMonths = (rate / (float) 100) / (float)12;
        double monthlyPayment = principal * (rateInMonths * Math.pow((1 + rateInMonths), timeInMonths)) / (Math.pow((1 + rateInMonths), timeInMonths) - 1);
        String result = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Your monthly payment is: " + result);
    }
}