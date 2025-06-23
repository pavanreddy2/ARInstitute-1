package com.ar.operators;

public class ComparisonOperatorEx {
    public static void main(String[] args) {

        int a = 10, b =20;
        int x = 100, y = 100;

        System.out.println(a == b); // 10 == 20 ==> false.
        System.out.println(x == y); // true.

        System.out.println(a != b); // true
        System.out.println(x < y); // false
        System.out.println(x <= y); // true
        System.out.println(a > 100); // 10 > 100 ==> false.
    }
}
