package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println();
            System.out.print("Enter the operator among this + - * / % : ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // Take two numbers as  input
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                System.out.println();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Operation !!!");
            }
            System.out.print("The answer is: "+ans);
            System.out.println();
        }
    }
}
