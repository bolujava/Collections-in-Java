package org.example.list;

import java.util.HashSet;

public class HashSetex {
    public static void main(String[] args) {
        HashSet<String> car = new HashSet<>();
        car.add("Volvo");
        car.add("Mazda");
        car.add("BMW");
        car.add("Toyota");
        car.add("Toyota");
        car.add(null);
        car.add(null);
        //******************************ADVANCED FOR LOOP*************************
        for (String jset: car){
            System.out.println("Advanced for () loop: " +jset);
        }


        //*************************ANOTHER WAY OF ITERATING***using forEach()******************************

        car.forEach(jset-> System.out.println(jset));

        //////check this out;

        //******************************please try out new ones




    }
}
