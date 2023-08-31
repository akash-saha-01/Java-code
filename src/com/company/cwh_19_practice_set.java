package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class cwh_19_practice_set {
    public static void main(String[] args) {
        // QUESTION----1: throw an error in line no 7 because (age == 10)
//        int age = 11;
//        if (age = 10) {
//            System.out.println("i am 11");
//        }
//        else{
//            System.out.println("i am not 11");
//        }

        // QUESTION----2:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your marks of sub1");
//       float sub1 = sc.nextFloat();
//        System.out.println("enter your marks of sub2");
//       float sub2 = sc.nextFloat();
//        System.out.println("enter your marks of sub3");
//        float sub3 = sc.nextFloat();
//        float total_marks = (sub1+sub2+sub3);
//        float total_percentage = ((sub1+sub2+sub3)/3f)*10;
//        System.out.println("Total Marks Is");
//        System.out.println(total_marks);
//        System.out.println("Total Percentage is "+total_percentage);
//       // System.out.println(total_percentage);
//        if(total_percentage>=40 && sub1>33 && sub2>33 && sub3>33){
//            System.out.println("You are pass");
//        }
//        else{
//            System.out.println("You are fail");
//        }

        // QUESTION--------3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your income");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.50f){
//            tax = tax + 0;
//
//        }
//        else if(income>2.50f && income<=5.0f){
//            tax = tax +0.05f *(income-2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax = tax+0.05f *(5.0f-2.5f);
//            tax = tax+0.2f *(income -5.0f);
//        }
//        else if(income>10.0f){
//
//            tax = tax+0.05f *(5.0f-2.5f);
//            tax = tax+0.2f *(10.0f -5.0f);
//            tax = tax+0.3f *(income -10.0f);
//        }
//        System.out.println("paid by the employee is "   + tax);

        // QUESTION---------4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of any day");
//        int day = sc.nextByte();
//        switch (day){
//            case 1 :
//            System.out.println("MONDAY");
//            break;
//            case 2 :
//                System.out.println("TUESDAY");
//                break;
//            case 3 :
//                System.out.println("WEDNESDAY");
//                break;
//            case 4 :
//                System.out.println("THURSDAY");
//                break;
//            case 5 :
//                System.out.println("FRIDAY");
//                break;
//            case 6 :
//                System.out.println("SATURDAY");
//                break;
//            case 7 :
//                System.out.println("SUNDAY");
//                break;
//        }
//        System.out.println("enter any year");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
//            System.out.println(year + " it is leap_year");
//        }
//        else {
//            System.out.println(year + " it is not a leap_year");
//
//        }

        // QUESTION 6
        System.out.println("enter any one .org or .com or .in website : : ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("it is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("it is an organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("it is a indian website");
        }

    }
}
