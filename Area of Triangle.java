// Area of Triangle
package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float a = sc.nextInt();
        System.out.print("Enter the breath: ");
        float b = sc.nextInt();
        float area = (float) ((0.5) * a * b);
        System.out.print("Area of Triangle = "+ area + " Square-unit");

    }
}
