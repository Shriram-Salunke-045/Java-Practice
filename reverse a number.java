package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int  ans = 0;

        while(n>0) {
            int rem = n % 10;
             n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.print(ans);
    }
}
