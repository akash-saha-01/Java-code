package com.company;
import java.util.Scanner;
public class cwh_25_practice_set_5 {
    public static void main(String[] args) {
//        practice problem 1
//        int n = 4;
//        for( int i=n; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


//        Practice problem 2
//        frist four even number are 0,2,4,6
//        int sum = 0 ;
//        int n = 4;
//        for(int i =0; i<n; i++){
//           sum = sum + (2*i);
//        }
//        System.out.println("sum of the even number : "+ sum);



//        practice problem 3
//
//        int n = 5;
//        for(int i =1; i<=10; i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);



//        problem 4
//        int n = 10;
//        for(int i=10; i>0; i-- ){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

//      problem 5

//        int n = 5;
//        int factorial = 1;
////        what is factorial n = n* n-1 * n-2*......1
////         5! = 5*4*3*2*1
//        for(int i = 1; i<=n; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);


//        problem no 9

//                int n = 8;
//                int sum = 0;
//        for(int i =1; i<=10; i++) {
//            sum += n * i;
//        }
//        System.out.println(sum);

//        for(int COUNTER =0; COUNTER<100; COUNTER++){
//            System.out.println("H.W");
//        }



//        for(int num =0; num <11; num++){
//            System.out.print(num+" ");
//        }

//       int i = 0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter any value of n : ");
//        int n = sc.nextInt();
//        int n = 4;
//        int sum = 0;
//        for(int i =1; i<=n; i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);
//        int i = 0;
//        while(i<=n){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);


//        table of 2

//
//
//        int n = 2;
//        for(int i =0; i<=10; i++){
//            System.out.printf("%d * %d = %d\n", n, i, n*i);
//        }


//        nested for loop (pattern of loop)
//       ******  solid rectangle   *******

        int n =4;
        int m =5;

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("");
        }




    }
}
