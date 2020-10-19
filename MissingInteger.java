package com.company;

import java.util.Arrays;

public class MissingInteger {
    public static int findMissingInt(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i <= a.length; i++) {
            if (a[i] != i+1) {
                return i+1;
            }
        }
        return -1;
    }
}
