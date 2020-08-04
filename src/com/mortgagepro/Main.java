package com.mortgagepro;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Credit Score:");
        Integer credit = Integer.valueOf(scanner.nextLine());

        if (credit < 600) {
            out.println("I'm sorry you are not eligible for a loan with a credit score that low.");

        }
        if (credit >= 600) {

            out.println("Congratulations you are eligible for a loan!");

            out.print("Loan Amount:");
            Integer loan = Integer.valueOf(scanner.nextLine());

            out.print("Annual Percent Rate:");
            Integer apr = Integer.valueOf(scanner.nextLine());

            out.print("Years:");
            Integer years = Integer.valueOf(scanner.nextLine());

            out.println("Loan:" + loan);
            out.println("Annual Percent Rate:" + apr);
            out.println("Years:" + years);

            double payout = ((loan/100) * apr) + (loan);
            double payments = (years * 12);
            double mortgage = payout / payments;

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String result = currency.format(mortgage);

            out.println("Mortgage Payments:" + result);

        }

        }
}
