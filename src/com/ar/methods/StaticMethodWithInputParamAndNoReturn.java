package com.ar.methods;

public class StaticMethodWithInputParamAndNoReturn {

    //static method with input param and No return

    public static void printMessge(String message) {
        System.out.println("Hello, " + message + "! Welcome to AR Institute");
    }

    public static void squareNumber(int number) {
        System.out.println("Square of: "+ (number * number));
    }

    public static void main(String[] args) {


        StaticMethodWithInputParamAndNoReturn.printMessge("Sai");

        StaticMethodWithInputParamAndNoReturn.squareNumber(5);
    }
}
