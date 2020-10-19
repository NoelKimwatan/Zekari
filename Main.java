package com.company;

public class Main {

    public static void main(String[] args) {
        // test inputs
        int[] missingIntInput1 = {3, 5, 4, 1, 2, 7, 8};
        String reverseStringInput1 = "Lorem at";
        String reverseStringInput2 = "Tempor ip";

        // calls and prints
        System.out.println(MissingInteger.findMissingInt(missingIntInput1));
        System.out.println(StringReverse.reverseString(reverseStringInput1));
        System.out.println(StringReverse.reverseString(reverseStringInput2));
    }
}
