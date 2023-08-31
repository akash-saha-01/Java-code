package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Percentage_Calculation {
    public static void main (String[] args){
        System.out.println("enter your 5 subject marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of sub 1");
        float a = sc.nextFloat();

        System.out.println("enter the marks of sub 2");
        float b = sc.nextFloat();

        System.out.println("enter the marks of sub 3");
        float c = sc.nextFloat();

        System.out.println("enter the marks of sub 4");
        float d = sc.nextFloat();

        System.out.println("enter the marks of sub 5");
        float e = sc.nextFloat();

        float total_marks = (a+b+c+d+e);
        System.out.println("the total marks is");
        System.out.println(total_marks);

        System.out.println("total percentage is");
        float percentage = (total_marks/5);
        System.out.println(percentage);


    }

}
