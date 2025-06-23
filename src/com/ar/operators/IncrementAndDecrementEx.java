package com.ar.operators;

public class IncrementAndDecrementEx {
    public static void main(String[] args) {

        int a = 10;

        int b = ++a; // pre increment // 12

        int c = b++; // post increment

        int d = c-- ; //post decrement

        int e = --a;

        int f = c++;

        System.out.println(a); //11
        System.out.println(b); //12
        System.out.println(c); //10
        System.out.println(d); // 11
    }
}
