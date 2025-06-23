package com.ar.operators;

public class BooleanLogical {
    public static void main(String[] args) {

        int age = 25;

        boolean hasId = true;


        System.out.println(!hasId); // !true // false
                            // true && true  // true.
        System.out.println(age >= 18 && hasId); //
                            //false && true  // false
        System.out.println(age >= 75 && hasId); //
                            //false && false   // false
        System.out.println(age >= 75 && (hasId = false));

        //Logical OR
                         // true  || true // true
        System.out.println(age >= 18 ||  hasId);

                          //false || true   // true
        System.out.println(age >= 75 || hasId); //


                            //false || false  //false
        System.out.println(age >= 75 || (hasId = false));


    }
}
