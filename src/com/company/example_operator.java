package com.company;

public class example_operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

//   AND operator
        System.out.println(a && b);
        System.out.println(b && c);
//   OR OPERATOR
        System.out.println(a || b);
        System.out.println(b || c);

//        TERNARY operator
        System.out.println(a && b? "Correct":"Incorrect");
    }
}
