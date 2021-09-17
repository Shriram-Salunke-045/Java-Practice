package com.shriram;

// fibrosis series  program in java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int sum;
        System.out.print("Enter the count number: ");
        int n = sc.nextInt();
        System.out.print(n1);

        for (int i = 1; i < n; i++) {
            sum = n1 + n2;
            System.out.print(", " + n2);
            n1 = n2;
            n2 = sum;
        }

    }
}
