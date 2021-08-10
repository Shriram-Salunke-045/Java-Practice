package com.shriram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i;
        for(i=1;i<=n;++i){
            if(n % i == 0){
                System.out.println(i+ " ");
            }
        }

    }
}
