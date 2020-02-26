package office_hour;

import java.util.Arrays;

public class MallShopping {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //TASK 1. Check if all 3 arrays are exact same length
        //Print "All arrays are equal length"
        if(items.length ==prices.length && items.length==itemIDs.length){
            System.out.println("All array are equal length");
        }
        //TASK 2. Print how many items purchased
        //System.out.println("Items count: " + ??);
        System.out.println("item count: " + items.length);

        //TASK 3. Print a receipt report.
        /*
            12345 - Shoes - $99.99
            ...
            458.8 * 0.06 + 458.8
            Total price: $458.8 (include tax)
         */
       double totalPrice =0.0;
//        for (int i = 0 ; i< items.length ; i++){
//            System.out.println(itemIDs[i] +" - " + items[i] +" - " +prices[i]);
//            totalPrice +=prices[i]*0.06;
//        }
//        System.out.println("Total price: " + totalPrice + "(include tax)");
//
//        double totalPrice = 0.0;

        for (int x = 0; x < items.length; x++) {
            System.out.println(itemIDs[x]+" - "+items[x]+" - "+prices[x]);
            totalPrice+= prices[x]*0.06;
          //  System.out.println("Total price: "+ totalPrice+"(tax includes)");
        }System.out.println("Total price: "+ totalPrice+"(include tax)");


        System.out.println("================");
        //TASK 5. Find the most expensive item and print all details
        //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}

        double maxPrice = prices[0];
        int maxPriceIndex =0 ;

        // YOUR CODE GOES HERE
        for(int i = 0 ; i < prices.length ; i++){
            if(maxPrice<prices[i]){
                maxPrice=prices[i];
                System.out.println(i);
            }

        }


        // BELOW IS ALREADY WRITTEN FOR YOU
      //  System.out.println(maxPrice );
        //System.out.println();
       // System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+ prices[maxPriceIndex]);
        System.out.println("Most expensive item:");
        //System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);

        String[] array = {"I love Java"};
        for( int i = 0 ; i < 10 ; i++) {
            System.out.println((i+1) + Arrays.toString(array));
        }











    }
}

















