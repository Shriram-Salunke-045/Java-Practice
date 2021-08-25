// Area of isosceles triangle
package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height h : ");
        float a = sc.nextFloat();
        System.out.print("Enter the base b : ");
        float b = sc.nextFloat();
        float area = (a * b)/2;
        System.out.print("Area of  Isosceles Triangle = "+ area + " Square-unit");

    }
}
