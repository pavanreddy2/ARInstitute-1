package com.ar.variables;

public class LocalVariable {

    //Instance variable
    char c = 'a';


    //Instance Variable
    int k ;

    //static Variable
    static int i = 200;

    public static void main(String[] args) {

        //Local Variable
        boolean flag = true;
        System.out.println(flag);

       // by using new
      LocalVariable ref = new LocalVariable();

      int j;

        System.out.println(ref.k);

        //System.out.println(j);
    }
}
