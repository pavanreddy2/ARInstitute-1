package com.ar.operators;

public class IncrementAndDecrementEx1 {
    public static void main(String[] args) {

        int a = 100;

        int b = ++a; // pre-increment

        int c = a++; // post-increment

        System.out.println(a);  // 101   // 102
        System.out.println(b);  // 101
        System.out.println(c); //101
    }
}
