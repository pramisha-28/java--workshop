
import java.util.Scanner;

public class NameGenerated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name=input.next();
        System.out.println("enter your gender");
        String gender=input.next();
        System.out.println("enter your qualification");
        String qualification=input.next();
        StringBuilder sb=new StringBuilder();
        if ("female".equalsIgnoreCase(gender)); {
        
            sb.append("Ms.").append (gender);
            String result=sb.toString();
            System.out.println(result);
        }
        if ("male".equalsIgnoreCase(gender))
         {
        
            sb.append("Mr.").append (gender);
            String result=sb.toString();
            System.out.println(result);
        }

    }
    
}
