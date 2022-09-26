package com.start;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,23,4,32,24,4,48,84,841,1);
    }
    static void fun(int ...d) {
        System.out.println(Arrays.toString(d));
    }
}
