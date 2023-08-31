package com.company;

public class cwh_25_break_continue {
    public static void main(String[] args) {
////        break and continue using loop
//        for(int i =0; i<5; i++){
//            System.out.println(i);
//            System.out.println("java");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//
//            int i=0;
//            while(i<5){
//        System.out.println(i);
//        System.out.println("java");
//        if(i==2){
//            System.out.println("ending the loop");
//            break;
//        }
//        i++;
//         }
//        do{
//            System.out.println(i);
//            System.out.println("java");
//            if(i==3){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }while (i<5);
        for(int i = 0; i<5; i++){
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java");
        }


    }
}
