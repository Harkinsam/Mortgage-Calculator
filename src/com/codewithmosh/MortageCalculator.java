package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal;
        do {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal < 1000 || principal > 100000) {
                System.out.println("Enter a number between 1000 and 1000000");
            }
        } while (principal < 1000 || principal > 1000000);

        float interest_Rate;
        do {
            System.out.print("Annual Interest Rate: ");
            interest_Rate = scanner.nextFloat();
            if (interest_Rate < 1 || interest_Rate > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
        } while (interest_Rate < 1 || interest_Rate > 30);

        interest_Rate = interest_Rate / 1200;

        int years;
        do{
            System.out.print("period (Years): ");
            years = scanner.nextInt();
            if(years < 1 || years > 30){
                System.out.println("Enter a value between 1 and 30");
            }
        }while(years < 1 || years >30);
        years = years * 12;


        double mortgage = principal * (interest_Rate * Math.pow(1 + interest_Rate, years)) / Math.pow(1 + interest_Rate, years) - 1;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgagesCurrency = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgagesCurrency);

    }

}
