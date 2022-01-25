package com.syntax.Practice;

public class ConvertStringToStringArray {
    public static void main(String[] args) {




        String str = "Java,Maven,Cucumber,TestNG";

        String[] str2 = str.split(",");

        for (String word : str2) {

            System.out.println(word);

        }

       String toReverse= "I like Java";
       StringBuilder Sb = new StringBuilder(toReverse);
       Sb.reverse();
        System.out.println(Sb);
    }
}

