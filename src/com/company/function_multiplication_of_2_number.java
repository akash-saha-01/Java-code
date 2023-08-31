package com.company;

import java.util.Scanner;

public class function_multiplication_of_2_number {
    public static int sumOfTwoNumber(int a, int b){
        return(a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();
        System.out.println(" miltiplication of a * b is " + sumOfTwoNumber(a,b));

    }
}
