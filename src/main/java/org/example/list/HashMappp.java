package org.example.list;

import java.util.HashMap;

public class HashMappp {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();
        map.put("Lagos", 750);
        map.put("Freetown", 500);
        map.put("Abidjan", 566);
        map.put("Lagos", 566);
        map.put("Dior", 766);
        System.out.println(map);

        //***********ACCESSING VALUE*********
        Integer lagosValue = map.get("Lagos");
        System.out.println(lagosValue);
        //output
        map.remove("Freetown");
        System.out.println(map);// this is to show the resulting maplist.

        int size = map.size();//
        System.out.println(size);




        boolean exist = map.containsKey("Malta");//THIS IS TO SHOW WHETHER IT IS TRUE THAT MALTA EXIST.

        System.out.println(exist);

    }
}
