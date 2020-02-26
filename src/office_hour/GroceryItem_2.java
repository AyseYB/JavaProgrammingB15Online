package office_hour;

import java.util.Arrays;

public class GroceryItem_2 {

    public static void main(String[] args) {

        float[] prices ={ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };
        //• 2, loop through each prices  and print them in one line
//        System.out.println(Arrays.toString(prices));
//       float lastPrice =prices[prices.length-1];
//       for (float eachPrice:prices){
//           System.out.print(eachPrice);
//           if(eachPrice !=lastPrice){
//               System.out.print( ", ");
//           }
//       }
//        // 2.1 print each prices in even index
//        float evenIndex =0;
//        for (int i = 0 ; i < prices.length ; i++){
//          //  System.out.println(Arrays.toString(prices));
//            if( i %2 == 0){
//                ++evenIndex;
//                System.out.print(prices[i] + " ");
//            }
//        }
        //2.2 print only prices less that 3 dollars
        for(int x = 0; x < prices.length ; x++){
            if(prices[x] < 3 ){
                System.out.println(prices[x] + " ");
            }
        }

        //2.3 print the sum of all the prices and get average

//        int sum =0;
//        for (int y =0 ; y < prices.length ; y++){
//            sum++;
//        }
//        System.out.println(sum);
        float sum =0;

        for (int x = 0; x < prices.length; x++) {
            sum += prices[x];
        }
        System.out.println(sum);
        System.out.println("average " + sum/prices.length);

        System.out.println();
        //.4 print only the second half of prices (last 3)
     for( int i = prices.length/2 ; i < prices.length ;i++){
         System.out.println(prices[i]);
     }

        System.out.println();
     // 2.5 print the sum of the middle two prices

        float sumOfMidNum =0;
        for (int i = prices.length/2 ;(  i <= prices.length/2 + 1) ; i++ ){
            sumOfMidNum = sumOfMidNum+prices[i];
            System.out.println(" bakalim ortadaki iki fiyat mi" + prices[i]);
        }
        System.out.println(sumOfMidNum);
        System.out.println();

        //2.6 print only prices more than average price
        float averagePrice= sum/prices.length;
        for (int i = 0 ; i < prices.length ; i++){
            if(prices[i]>averagePrice){
                System.out.println("price more than average price" + prices[i]);
            }
        }
//        2.7 find out max price and print out max price and  index of max price
        float max =prices[0];
        for (int i = 0 ; i < prices.length ; i++){
            if(prices[i] > max){
                max=prices[i];
            }
        }
        System.out.println("Max price " + max);

















    }
}
