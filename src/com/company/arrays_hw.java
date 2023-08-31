package com.company;

import java.util.Scanner;

public class arrays_hw {
    public static void main(String[] args) {
//        problem no 1
//       ***************  enter any string in an array *********************
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" enter how many name you have entered ? ");
//        int size = sc.nextInt();
//        String name[] = new String[size];
//
//        // Input
//        for(int i =0; i<size; i++){
//            System.out.println(" enter your name : ");
//            name[i] = sc.next();
//        }
//
//        // Output
//        for(int i =0; i<name.length; i++){
//            System.out.println("your name is : " + name[i] );
//        }




//        Problem 2
//        ******************** Maximum & Minimum Value *******************
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter How Many Number You Are Compare:");
//        int size = sc.nextInt();
//        int value [] = new int [size];
//
//        // input
//        for(int i = 0; i<size; i++){
//            System.out.println("Enter Your Numbers :");
//            value[i] = sc.nextInt();
//        }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        //Output
//        for(int i = 0; i<value.length; i++){
//            if(value[i]< min){
//                min = value[i];
//            }
//            if(value[i]>max){
//                max = value[i];
//            }
//        }
//        System.out.println("Largest number is : " + max);
//        System.out.println("Lowest number is : " + min);




//        Problem 3
//        ****************** Array Ascending And Descending Order *******************

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers [] = new int [size];


        // input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for(int i = 0; i<numbers.length-1; i++){
            // numbers.length -1 as termination condition
            if(numbers[i] > numbers[i+1]){
                isAscending = false;

            }
        }
        if(isAscending){
            System.out.println("Array is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }


    }
}
