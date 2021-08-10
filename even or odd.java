package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        if(n %2 == 0){
            System.out.println("the given number "+n+" is even");
        }
        else{
            System.out.println("the given number "+n+" is odd");
        }
        
    }
}
