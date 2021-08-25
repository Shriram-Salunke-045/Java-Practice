// Area of Triangle
package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height: ");
        float a = sc.nextFloat();
        System.out.print("Enter the Base: ");
        float b = sc.nextFloat();
        float area = (float) ((0.5) * a * b);
        System.out.print("Area of Triangle = "+ area + " Square-unit");

    }
}
