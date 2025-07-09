import java.util.Arrays;
import java.util.Collections;

public class decending {
    public static void main(String[] args) {
        Double[]prices ={30.24,29.32,23.03};
        Arrays.sort(prices,Collections.reverseOrder());
        System.out.println("list in desending order");
        for(Double price:prices)
        {
            System.out.println(price);
        }
    }
        
}

    

