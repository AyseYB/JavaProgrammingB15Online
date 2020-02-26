package office_hour.Practice12_11;

import java.util.Arrays;

public class Array {

    public static <fruits> void main(String[] args) {
        // 1.7 print out only those items end with letter e
        String[] fruits = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

//        for (int i = 0; i < fruits.length; i++) {
//            String str = fruits[i];
//            if(str.endsWith("e")){
//                System.out.println(str);
//            }
//
//        }
        for (int i = 0; i < fruits.length; i++) {
            String str = fruits[i];
            if (str.endsWith("e")) {
                System.out.println(str);
            }
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //---------for each loop
        System.out.println("=========================");
//        for ( String each :  fruits){
////           if(each.endsWith("e")){
////               System.out.println(each);
//////           }
//            char lastChar = each.charAt(each.length()-1);
//            if(lastChar == 'e'){
//                System.out.println(lastChar);
//                System.out.println(each);
//            }
        //}

        for (String each : fruits) {
            if (each.endsWith("e")) {
                System.out.println(each);
            }


        }

        //  1.8 print out only last 3 characters of all the items
        System.out.println("===========================");
//        for (int i = 0; i <fruits.length ; i++) {
//            String last3= fruits[i].substring(fruits[i].length()-3, fruits[i].length());
//            System.out.println(last3);
//        }
//
//        for (String each  : fruits){
//           String last3 = each.substring(each.length()-3);
//            System.out.println(last3);
//        }
//      for (String each: fruits){
//          String last3 = each.substring(each.length()-3);
//          System.out.println(last3);
//      }

        for (int i = 0; i < fruits.length; i++) {
            String last3 = fruits[i].substring(fruits[i].length() - 3);
            System.out.println(last3);
        }
        System.out.println("==========================");
//        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
//        float max = prices[0];
//        for (  float each : prices){
//            if(each > max){
//                max = each;
//            }
//        }
//        System.out.println(max);
        float maxPrice = 0.0f;
        for ( float each: prices){
            if( each > maxPrice){
                maxPrice= each;
            }
        }
        System.out.println(maxPrice);


        System.out.println("=========================");

//        float secondMax =prices[0]; //to store second max number
//        for ( float eachPrice : prices){
//            if(eachPrice > secondMax && eachPrice != max){
//                secondMax = eachPrice ;
//               // System.out.println(secondMax);
//            }
//        }

        float secondMax = prices[0];
        for ( float each : prices){
            if( each > secondMax && each != maxPrice ){
                secondMax = each;
            }

        }
        System.out.println(secondMax + " second max fiyat ");

        // finding index number of second max number

        for (int i = 0 ; i < prices.length ; i++){
            if (prices[i] == secondMax){
                System.out.println("index number of " + secondMax + " is " + i);
            }
        }
//        for (int i = 0; i < prices.length; i++) {
//            if(prices[i] == secondMax){
//                System.out.println("index number of " + secondMax + " is :" + i);
//            }
//        }
//// finding max number index
        for (int i = 0 ; i < prices.length; i++){
            if( prices[i] == maxPrice){
                System.out.println("index number of " + maxPrice + " is = " + i);
            }
        }
//        for (int i = 0; i < prices.length; i++) {
//            if(prices[i] == max){
//                System.out.println("index number of " + max + " is :" + i);
//            }
//        }


//    }
    }

}