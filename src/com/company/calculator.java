package com.company;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("WELCOME TO RESULT  CALCULATION SECTION");
        Scanner input = new Scanner(System.in);

        System.out.println("enter the marks of sub1");
        float sub1 = input.nextFloat();
        System.out.println("enter the marks of sub2");
        float sub2 = input.nextFloat();
        System.out.println("enter the marks of sub3");
        float sub3 = input.nextFloat();
        System.out.println("enter the marks of sub4");
        float sub4 = input.nextFloat();
        System.out.println("enter the marks of sub5");
        float sub5 = input.nextFloat();

        System.out.println("TOTAL MARKS IS");
        float total_marks = (sub1+sub2+sub3+sub4+sub5);
        float percentage_marks = (total_marks/5);

        System.out.println(total_marks);
        System.out.println(percentage_marks);


    }
}
