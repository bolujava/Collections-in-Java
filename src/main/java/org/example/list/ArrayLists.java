package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        /*ArrayList<String>car = new ArrayList<>();
        car.add("Volvo");
        car.add("Mazda");
        car.add("Toyota");
        car.add("Honda");
        System.out.println(car);

        //........................................................................
        //Iterating ArrayList for-each loop;
        ArrayList<String>car1 = new ArrayList<>();
        car1.add("Volvo");
        car1.add("Mazda");
        car1.add("Toyota");
        car1.add("Honda");
        for (String i: car1){
            System.out.println(i);
            //.................(USING ITERATOR)..................................................
            ArrayList<String>car2 = new ArrayList<>();
            car2.add("Volvo");
            car2.add("Mazda");
            car2.add("Toyota");
            car2.add("Honda");
            Iterator itr = car2.iterator();
            while (itr.hasNext()){
                System.out.println(itr.next());
            }//.............(REMOVE AN ITEM FROM ARRAY)...................................
            ArrayList<String>country = new ArrayList<>();
            country.add("Israel");
            country.add("Djibouti");
            country.add("Madagascar");
            country.add("Swahili");
            System.out.println(country);
            country.remove(1);
            System.out.println(country);


        }//...............(PUTTING ITEM INTO ANOTHER ITEM)..................................
        ArrayList<String>country = new ArrayList<>();
        country.add("Israel");
        country.add("Djibouti");
        country.add("Madagascar");
        country.add("Swahili");
        System.out.println(country);
        country.remove(1);
        System.out.println(country);




        ArrayList<String>country2  = new ArrayList<>();
        country2.add("America");
        country2.add("Malta");
        country.addAll(country2);   // the new countries we want to add!
        System.out.println(country);*/


        //................(RETAINING ALL ITEMS).................................................................

        ArrayList<String>country = new ArrayList<>();
        country.add("Israel");
        country.add("Djibouti");
        country.add("Madagascar");
        country.add("Swahili");
        System.out.println(country);
        country.remove(1);
        System.out.println(country);




        ArrayList<String>country2  = new ArrayList<>();
        country2.add("America");
        country2.add("Malta");
        country2.add("Israel");
        country.retainAll(country2);   // the new countries to retain
        System.out.println(country);

        //......................(ITERATING IN ANOTHER WAY)....................

        country.retainAll(country2);

        Iterator it = country.iterator();
        while(it.hasNext()){
            //System.out.println(country);//WRITE IT WELL

        }







    }
}
