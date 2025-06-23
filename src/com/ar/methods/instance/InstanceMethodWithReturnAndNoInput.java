package com.ar.methods.instance;

public class InstanceMethodWithReturnAndNoInput {

    //Instance Method
    public String getMessage() {
        return "Welcome AR Institute..";
    }
    public static void main(String[] args) {

        //Access Instance Method
        //By Using new Keyword.

        InstanceMethodWithReturnAndNoInput ref = new InstanceMethodWithReturnAndNoInput();
       String result =  ref.getMessage();
        System.out.println(result);
    }
}
