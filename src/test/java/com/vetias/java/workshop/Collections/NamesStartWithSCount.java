package com.vetias.java.workshop.Collections;

import java.util.ArrayList;
import java.util.List;

public class NamesStartWithSCount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("pramisha");
        names.add("dhanush");
        names.add("dhanushya");
        names.add("rishika");
        names.add("shrika");
        names.add("sri vignesh");
        long nameCount = names.stream()
        .filter(name -> name.startsWith("s")).count();
        System.out.println(nameCount);
    }
    
}
