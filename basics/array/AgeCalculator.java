package basics.array;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the year(only year)");
        int yearofBirth = inputScanner.nextInt();
        int currentyear = LocalDate.now().getYear();
        int age = currentyear-yearofBirth;
        System.out.println(age); 
    }
    
}
