package org.example.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;


public class LinkedLizz {
    public static void main(String[] args) {


        LinkedList<Magazine> magaz = new LinkedList<>();
        Magazine m1 = new Magazine("smith woi", 1, "Love on high", 23);
        Magazine m2 = new Magazine("xoi hui", 2, "High China", 78);
        Magazine m3 = new Magazine("femi craig", 3, "Casablanca", 6578);

        magaz.add(m1);
        magaz.add(m2);
        magaz.add(m3);
        //Collection stucked here




        for (Magazine i:magaz){
            System.out.println(i);
        }


    }
}

    class Magazine {

        String author;
        int id;
        String name;
        int quantity;


        public Magazine(String author, int id, String name, int quantity) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.author = author;
        }
    }





