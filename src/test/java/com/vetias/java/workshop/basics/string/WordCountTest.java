package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class WordCountTest {
    
@Test
public void testWordCount() {
    WordCountTest wordcount = new WordCountTest();
    int count = WordCountTest.count( "This is a java program");
    Assertions.assertEquals(5,count);
  }

@Test
public void testAnotherString() {
    WordCountTest wordcount = new WordCountTest();
    int count = wordcount.WordCountTest("pramisha gurl");
    Assertions.assertEquals(2,count);
   }
}




