package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter the Second number : ");
        float num2 = sc.nextFloat();

        char ch;
        System.out.println("Enter the operator you want from this +,-,*,/");
        ch=sc.next().charAt(0);

        if(ch=='+'){
            System.out.println("\nAddition of "+num1+" + "+num2+" = "+(num1+num2 ));
        }
        else if(ch=='-'){
            System.out.println("Subtraction of "+num1+" - "+num2+" = "+(num1-num2 ));
        }
        else if(ch=='*'){
            System.out.println("Multiplication of "+num1+" x "+num2+" = "+(num1*num2 ));
        }
        else if(ch=='/'){
            System.out.print("Division of "+num1+" / "+num2+" = "+(num1/num2 ));
        }
        else{
            System.out.print("Operator is not available" );
        }
    }
}
