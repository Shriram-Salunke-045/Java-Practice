package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("the "+num1+ " is greater than "+num2);
        }
        else if(num2>num1){
            System.out.println("the "+num2+ " is greater than "+num1);
        }
        else{
            System.out.println("both numbers are equal");
        }
    }
}
