package com.vetias.java.workshop.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListMarks {
    public static void main(String[] args) {
        List<Integer>marks = new ArrayList<>();
        marks.add(90);
        marks.add(89);
        marks.add(95);
        marks.add(98);
        marks.add(100);
        System.out.println("Ascending order");
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println("desending order");
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}