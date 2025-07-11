package com.vetias.java.workshop.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentListMergeExample {
    public static void main(String[] args) {
        
    List<Integer> csRollNos = Arrays.asList(1003,1004,1008,1006);
    List<Integer> csaRollNos = Arrays.asList(1001,1009,1006,1005,1004,1002);
    List<Integer> aRollNos = Stream.concat(csRollNos.stream(),csaRollNos.stream())
    .sorted().toList();
   System.out.println(aRollNos);
    }
}
