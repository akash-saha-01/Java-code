package com.company;

import java.util.Scanner;

public class function_qus_2_sumOf_2num {
    public static int sumOfTowNumber(int a, int b){
        int sum = a+b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();

        int sum = sumOfTowNumber(a,b);
        System.out.println("sum of a+b is : " + sum);

    }
}
