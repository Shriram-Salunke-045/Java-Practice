package com.shriram;

// find Total Surface area of Cube

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the side of cube: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float area = 6 * a*a;
        System.out.print("surface area of a cube is: " + area);
    }
