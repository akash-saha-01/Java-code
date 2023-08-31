package com.company;
import java.util.Scanner;
public class cwh_18_else_if {
    public static void main(String[] args) {
        String var = "akash";
        //              ---------------SWITCH CASE LADDER------------
        switch (var){
            case "akash":
                System.out.println("Your are going to become an adult");
                break;
            case "c":
                System.out.println("Your are going to become join a job");
                break;
            case "d":
                System.out.println("Your are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");

        }

//          --------------------IF-ELSE-IF Ladder---------------

       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age = sc.nextInt();
        System.out.println(age);
       if(age>65){
            System.out.println("You are experienced");
        }
        else if(age>56){
            System.out.println("You are semi-experienced");

        }
        else if(age>46){
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("you are not experienced");
        }*/

    }
}
