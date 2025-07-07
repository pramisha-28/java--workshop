package src.com.vetias.java.temperaturedata.beans;
import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String FirstName = "pramisha";
        String lastName = new String("dhanush");
        String ShortName = "prami";
        String buddyName = new String("pramisha");
        System.out.println(FirstName == ShortName);
        // String fullName = FirstName+""+lastName;
        // String finalName = FirstName.concat(lastName);
        // System.out.println(finalName.toUpperCase());
        String sentence = "This program shows how can we split a,string into multiple strings. We need to find sentence. to Word and letter count";    String words[] = sentence.split("");
        System.out.println(words.length);
        
    }
}

        
    

        
    
    

