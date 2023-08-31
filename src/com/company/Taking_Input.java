package com.company;
import java.util.Scanner;
public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input From The user");
        Scanner sc = new Scanner(System.in); // read from the keyboard
        System.out.println("enter number 1");
       // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("enter number 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a + b ;
        float sum = a + b ;
        System.out.println("the sum is ");
        System.out.println(sum);

    }
}
