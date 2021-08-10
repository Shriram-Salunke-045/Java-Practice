package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        float p = sc.nextFloat();

        System.out.print("Enter the Time : ");
        float t = sc.nextFloat();

        System.out.print("Enter the Rate : ");
        float r = sc.nextFloat();

        float SI = (p*t*r)/100;
        System.out.println("Simple Interest is : "+SI);
    }
}
