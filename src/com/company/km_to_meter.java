package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class km_to_meter {
    public static void main(String[] args){
        float km,meters;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kilometer value");
        km = sc.nextFloat();
        meters = km/1000;
        System.out.println("output is " + meters);
      //  System.out.print(meters);
    }
}
