package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the second number: ");
        int c = sc.nextInt();

        int max = a;
        if(b>max){
           max = b;
        }
        if(c>max){
           max = c;
        }
        System.out.println(max);
    }
}
