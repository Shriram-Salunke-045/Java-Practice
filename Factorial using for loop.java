package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int i,fact =1 ;
        for( i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.print("factorial of " +n+ " is : "+fact);
    }
}
