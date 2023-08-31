package com.company;
import java.util.Scanner;
public class test_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any value of n : ");
        int n = sc.nextInt();
        boolean odd = (n%2!=0);
        boolean even = ((n % 2) == 0);
        if(odd){
            System.out.println("Weird");
        }
        else if (even && n>=2 && n<=5 ) {
            System.out.println("not weird");
        }
        else if(even && n>=6 && n<=20) {
            System.out.println("weird");
        }
        if (even && n>20) {
            System.out.println("not weird");
        }
    }
}
