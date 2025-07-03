import java.util.Arrays;

public class parcel {
    public static void main(String[] args) {
        double[] prices ={19.99,5.49,12,99,3.99,25.00};
        Arrays.sort(prices);

        System.out.println("price list in ascending order:");
        for (double price : prices){
            System.out.println(price);

        }

    }
    
}
