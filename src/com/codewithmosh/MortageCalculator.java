package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest_Rate = scanner.nextFloat();
        interest_Rate = interest_Rate / 1200;

        System.out.print("period (Years): ");
        int years = scanner.nextInt();
        years = years * 12;

        double mortgage = principal * (interest_Rate * Math.pow(1 + interest_Rate, years )) / Math.pow(1 + interest_Rate, years) - 1;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgagesCurrency = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgagesCurrency);

    }

}
