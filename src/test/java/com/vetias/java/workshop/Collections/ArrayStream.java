package com.vetias.java.workshop.Collections;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks ={90,89,99,100};
        long numberOfSubjectPassed = Arrays.stream(marks)
        .filter(mark -> mark >40).count();
        System.out.println(numberOfSubjectPassed);


        IntStream markStream = Arrays.stream(marks);
        numberOfSubjectPassed = markStream
        .filter(mark -> mark> 40).count();
    }
    
}
