package com.company;

public class patttern_java {
    public static void main(String[] args) {

        //  ***************************** BUTTERFLY PATTERN ***********************************

//        int n = 4;
////        1st half or Upper half------1st part
////        outer for loop
//        for(int i =1; i<=n; i++){
////            inner for loop
//            for(int j =1; j<=i;j++){
//                System.out.print("*");
//            }
//
//            // spaces
//            int spaces = 2*(n-i);
//            for(int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//
//            // 2nd part star
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //        2st half or Upper half------1st part
////        outer for loop
//        for(int i = n; i>=1; i--){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//             //spaces
//            int spaces = 2 * (n-i);
//            for(int j =1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//
//            // 2nd part
//            for( int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }






        // ************************** SOLID RHOMBUS ****************************

//        int n = 5;
//        // Outer Loop
//        // for Row
//        for(int i = 1; i<=n; i++){
//            // inner loop
////            // for spaces
////            int spaces = (n-i);
//
//            for(int j=n; j>=i; j--){
//                System.out.print(" ");
//            }
//
//            // for star
//            for(int j =1; j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }






//       ************************ NUMBER PYRAMID *********************
//        int n=5;
//
//
//        for(int i =1; i<=n; i++){
//            // spaces
//            for(int j = 1; j<=n-i; j++){
//                System.out.print(" ");
//            }
////            print row number row number times
//            for(int j =1; j<=i; j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }




        // ****************************** Palindromic Pattern ****************************
//        example ----------> (BOB) <-----------

//        int n = 5;
////        Outer For Loop
//        for(int i =1; i<=n; i++){
//
//            //Inner for 1st half for spaces
//            for(int j =1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//
//
//            // 1st half for stars
//            for(int j =i; j>=1; j--){
//                System.out.print(j);
//            }
//
//
//            // 2nd half part
//            for(int j =2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }




//        ******************* Diamond Pattern *********************
        int n =4;

//        for upper part
        for(int i = 1; i<=n; i++){
//            Inner loop--------> for spaces
            for(int j =1; j<= n-i; j++){
                System.out.print(" ");
            }
//            for  print stars
            for(int j =1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        for lower part


        for(int i = n; i>=1; i--){
            for(int j =1; j<= n-i; j++){
//                for spaces
                System.out.print(" ");
            }
//            for star
            for(int j =1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
