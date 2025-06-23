package com.ar.methods;

public class Example {

    //Variable and Method
    //Static Variable
    static int i = 100;

    //Instance Variable
    char ch = 'a';

    //Instance Variable
    String str = "Ar Institute";

    //Instance Method
    public void m1 () {
        int age = 20;

        //is it possible create static variable ==> no


        System.out.println(i);
        System.out.println("Name: "+ str);
        System.out.println("age: "+ age);

    }

    //Static Method
    public static void m2 () {
        //Local Variable
         int j = 5000;

        System.out.println(j);

        System.out.println(i);
        //System.out.println(ch);
    }
    public static void main(String[] args) {

        Example example = new Example();
        example.m1();

        Example.m2();
    }
}
