package basics.array;

public class Stringc {
    public static void main(String[] args) {
        String sentance = "This program shows how can we split a " + 
                          "string into multiple string .We need to find sentance," +
                          "word and letter count"; 
                                  
        String word[] = sentance.split(" ") ;
        String sentances[] = sentance.split("\\.");
        System.out.println(word.length);
        System.out.println(sentances.length);
        System.out.println("letters"+sentance.length());
    }
    
}
