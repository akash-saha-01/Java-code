package com.company;
import java.util.Scanner;
public class decrementing_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any value of an integer: ");
        int n = sc.nextInt();
        for(int i =n; i>0; i--){
            System.out.println(i);
        }

    }
}
