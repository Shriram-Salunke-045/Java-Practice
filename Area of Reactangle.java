// Area of Rectangle
package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        float a = sc.nextFloat();
        System.out.print("Enter the Width: ");
        float b = sc.nextFloat();
        float area = a * b;
        System.out.print("Area of Triangle = "+ area + " Square-unit");

    }
}
