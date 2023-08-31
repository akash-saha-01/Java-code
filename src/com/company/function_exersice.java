package com.company;

import java.util.Scanner;

public class function_exersice {

//    ******************* average of two number **********************

//    public static float avgOfTwoNumber(float a , float b){
//        float sum = ((a+b)/2);
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the value of a : ");
//        float a = sc.nextInt();
//        System.out.println("enter the value of b : ");
//        float b = sc.nextInt();
//        float sum = avgOfTwoNumber(a,b);
//        System.out.println("the avarage value of a and b : " + sum);


//    ******************** sum of all odd number ***********************

//    public static void SumOfOddNumber(int n) {
//        int sum = 0;
//        // Loop
//        for (int i = 1; i <= n; i++) {
//            if ((n % 2)!= 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//    }
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the value of n");
//        int n = sc.nextInt();
//        System.out.println(" sum ");
//        SumOfOddNumber(n);



//     ****************** greater number *************************
//    public static int greaterNumber(int a, int b) {
//        if( a > b) {
//            return a;
//        }else {
//            return b;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the value of a");
//        int a = sc.nextInt();
//        System.out.println(" Enter the value of b");
//        int b = sc.nextInt();
//        System.out.println(greaterNumber(a,b));


//    ******************** Circle Circumference ***********************
//
//    public static double areaOfCircle(double r) {
//        return 2 * 3.14 * r ;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" enter the value of r : ");
//        double r = sc.nextInt();
//        System.out.println("area of the circle : " + areaOfCircle(r));


//    ********************* age is greater than 18 ****************
//
//    public static int forVote(int age) {
//        if (age > 18) {
//            System.out.println("You are Eligible for vote");
//        } else {
//            System.out.println("Sorry! You are not eligible for voting");
//        }
//        return age;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Age : ");
//        int age = sc.nextInt();
//        System.out.println(forVote(age));


//    **************** Greatest Common Divisor ****************

    public static int GCD(int a , int b) {
        while ( a != b) {
            if( a>b ){
                a = a - b ;

            }else{
                b = b - a;
            }

        }
        System.out.println( "GCD is " + b );
        return 0;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a : ");
        int a = sc.nextInt();
        System.out.println(" enter b : ");
        int b = sc.nextInt();

        System.out.println(GCD(a,b));
    }


}



