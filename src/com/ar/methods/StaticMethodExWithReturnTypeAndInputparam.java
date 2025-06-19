package com.ar.methods;

public class StaticMethodExWithReturnTypeAndInputparam {

    //Declaring method
    public static int add (int i, int j) {
         int c = i + j;
        System.out.println(c);
        return c;
    }

    //
   public static void m1 () {
       System.out.println("This is Static Method with no return Type and no input Paramter...");
   }

   public static char m2 (char c) {

       return c;
   }

   //
    public static String m3 (char ch) {

        return "This Character is: "+ ch;
    }

    public static void main(String[] args) {

        StaticMethodExWithReturnTypeAndInputparam.add(2000, 1000);

        StaticMethodExWithReturnTypeAndInputparam.m1();

       char result =  StaticMethodExWithReturnTypeAndInputparam.m2('a');
        System.out.println(result);

        String str = StaticMethodExWithReturnTypeAndInputparam.m3('P');
        System.out.println(str);
    }
}
