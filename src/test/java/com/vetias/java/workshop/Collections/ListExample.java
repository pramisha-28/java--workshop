package com.vetias.java.workshop.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("pramisha");
        names.add("dhanush");
        names.add("dhanushya");
        names.add("rishika");

        System.out.println(names);
        for(int i = 0;i< names.size();i++){
            System.out.println(names.get(i));
        }
        names.sort(Comparator.naturalOrder());
       System.out.println(names);        
    }

}
