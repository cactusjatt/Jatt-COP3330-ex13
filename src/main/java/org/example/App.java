/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        double p, rate;
        int years, compound;
        System.out.print("What is the principal amount? ");
        p = in.nextDouble();
        System.out.print("What is the rate? ");
        rate = in.nextDouble();
        System.out.print("What is the number of years? ");
        years = in.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        compound = in.nextInt();

        double base = (1 + ((rate*0.01)/compound));
        double exponent = compound * years;
        double amount = p * Math.pow(base, exponent);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("$" + df.format(p) + " invested at " + rate + "% for " + years + " years compounded " +
                compound + " times per year is $" + df.format(amount) + ".");

        in.close();
    }
}
