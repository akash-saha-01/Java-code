package com.company;

import java.util.Scanner;

public class function_factorial_of_number {
    public static void factorialOfTowNumber(int n){
        if (n<0){
            System.out.println("Invalid!");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of n :");
        int n = sc.nextInt();

        factorialOfTowNumber(n);

    }
}
