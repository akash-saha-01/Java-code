package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class pattern_of_java_using_loop {
    public static void main(String[] args) {

//       ************************  solid rectangle  **********************
//        int n =4;
//        int m = 5;
//
////        outer loop
//        for(int i =1; i<=n; i++){
//            for(int j=1; j<=m; j++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }

//        OUTPUT
//        *****
//        *****
//        *****
//        *****



//        ********************* hollow star pattern *************************
//        int n =4;
//        int m =5;

//        outer loop----->ROW
//        for(int i = 1; i<=n; i++){
////            inner for loop----->  Column
//            for(int j =1; j<=m; j++){
////                cell-----> (i,j)
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        OUTPUT
//        *****
//        *   *
//        *   *
//        *****






//        ********************* HALF PYRAMID ****************


//        int c = 4;
////        outer for loop-----> row number
//        for(int i =1; i<=c; i++){
////            inner for loop-------> colum number
//            for (int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//       OUTPUT
//        *
//        **
//        ***
//        ****





//       *****************  inverted half pyramid *****************


////        outer for loop
//        for(int i =4; i>=0; i--){
////            inner for loop
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        OUTPUT
//        ****
//        ***
//        **
//        *



//        ******************** INVERTED HALF PYRAMID *************************


//        int n =4;
////        Outer loop---------> row
//        for( int i =1; i<=n; i++){
////            inner loop ------> for spaces
//            for(int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
////            inner loop ------> for stars
//            for(int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




////        output
//           *
//          **
//         ***
//        ****



//       ********************** HALF PYRAMID OF NUMBER **********************
//        int n =4;
//        for(int i =1; i<=5; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }


//        OUTPUT
//        1
//        12
//        123
//        1234
//        12345



//        ************** INVERTED HALF PYRAMID ******************************
//        int n = 5;
////        outer loop
//        for(int i =1; i<=n; i++){
////            Inner loop
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        OR

//        outer loop
//        for(int i =n ; i>=1; i--){
//            for(int j =1; j<=i; j++){
//        inner loop
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }




//        Floyd Triangle

//
//        int n = 5;
//        int num = 1;
//        OUTER LOOP
//        for(int i =1 ; i<=n; i++){
////            inner loop
//            for(int j =1; j<=i; j++){
//                System.out.print(num+ " ");
//                num++; // num++ = num+1
//            }
//            System.out.println();
//        }


        int n = 5;
//        outer for loop
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }




    }
}
