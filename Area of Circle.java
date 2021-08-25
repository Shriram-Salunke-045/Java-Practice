// Area of Circle
package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle: ");
        float r = sc.nextInt();
        float area = (float) ((3.1428571429) * r * r);
        System.out.print("Area of Circle = "+ area);
    }
