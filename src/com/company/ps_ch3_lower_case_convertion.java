package com.company;

public class ps_ch3_lower_case_convertion {
    public static void main(String[] args) {
        // problem 1 UPPER TO LOWER CASE
        String name = " I AM A GOOD BOY";
        System.out.println(name.toLowerCase());

        //problem 2 SPACE REPLACE BY UNDERSCORE
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //problem 3 LETTER REPLACE BY ANOTHER LETTER
         String letter = "Dear <|name|> , Thanks a lot!";
        System.out.println(letter.replace("<|name|>", "some name"));

        //problem 4 DETECTED DOUBLE AND TRIPLE SPACES
        String myString = "this strings contains double and triple  spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem 5  USING ESCAPE SEQUENCE CHARACTER
        String letter2 = "Dear Akash  ,\n\t this java programme written by you";
        System.out.println(letter2);

    }
}
