package com.company;

import java.util.Arrays;

public class StringReverse {
    private static void swapElements(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static String reverseString(String s) {
        int length = s.length();
        char[] stringArray = s.toCharArray();
        for (int i = 0; i < length; i += 4) {
            int y = Math.min(i + 3, length-1);
            int x = i;
            while (x < y) {
                swapElements(stringArray, x++, y--);
            }
        }
        return String.valueOf(stringArray);
    }
}
