package com.ar.variables;

public class StaticVariableEx {

    //Declaring Static Variable
    //Static Variable
    static int i = 100;

    public static void main(String[] args) {

        //Accessing the Static variable

        //By Using Class Name.
        System.out.println(i);

        //By using "new" Keyword.

        //ClassName refName = new ClassName();
        StaticVariableEx staticVariableEx = new StaticVariableEx();
        System.out.println(staticVariableEx.i);
    }
}
