package com.ar.variables;

public class InstanceVariableEx {

    //Instance Variable
    //A variable which is declared inside the class & outside of the method is called as Instance  Variable

    //Declare
    int i = 1000;

    public static void main(String[] args) {

        //Access variable

        //BY Using new Keyword;
        //ClassName refName = new ClassName();
        InstanceVariableEx ex = new InstanceVariableEx();
        System.out.println(ex.i);
    }
}
