package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
          /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productList = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));
        System.out.println("productList = " + productList);
        System.out.println("productLst element count " + productList.size());


       String itemDetails = "iPhone 6s,449,18.71";
        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price = " + itemDetails.split(",")[1]);
        System.out.println("item monthly $ = " + itemDetails.split(",")[2]);
//        System.out.println("item price $ = " + itemDetails.split(",")[1]);
//        System.out.println("item monthly payment $ = " + itemDetails.split(",")[2]);
//        System.out.println("item monthly payment $ = " + Double.parseDouble(itemDetails.split(",")[2]));
//
//         //* Task 1 : print only items name
//        for ( String eachPart : productList){
//            String namePart = eachPart.split(",")[0];
//            System.out.println("each product namePart = " + namePart);
//        }
        for ( String eachProduct : productList ){
    //        System.out.println("eachProduct name = " + eachProduct.split(",")[0]);
        }


        //         * Task 2 : print all the prices more than 500
        for ( String eachProduct : productList ){
           double price =Double.parseDouble( eachProduct.split(",")[1]);
           // System.out.println("price = " + price);
            if(price>500){
                System.out.println("price = " + price);
            }
        }

        //         * Task 3 : print average price

        double sum = 0;
        double average = 0;
        for ( String eachProduct : productList){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum+= + price;
        }
        System.out.println("sum $ = " + sum );
        System.out.println("average $ = " + sum /productList.size());
//
//        //* Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productList){
            String name =eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if( monthly <20){
                System.out.println( monthly + "  " + name);
            }
        }

//
//     // * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        System.out.println(" ============task 5 ==============");
        for (String eachProduct: productList){
            String name = eachProduct.split(",")[0];
            double monthly =Double.parseDouble(eachProduct.split(",")[2]);
            if(name.contains("iPhone")){
                System.out.println(name + " " +   monthly);
            }
        }

        System.out.println("\n-----------Task 6 ----------with for each loop");
//         * Task 6 : Print all information about most expensive item.

        // assume first item price is max price before comparing
//        double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
//        String maxPriceItem ="";
//        for ( String eachProduct : productList){
//            double price = Double.parseDouble(eachProduct.split(",")[1]);
//            if(price> maxPrice) {
//                maxPrice = price;
//                maxPriceItem = eachProduct;

       double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
       String maxPriceItem = "";
       for (String  eachProduct :productList) {
           double price = Double.parseDouble(eachProduct.split(",")[1]);
           if(price>maxPrice){
               maxPrice = price;
               maxPriceItem = eachProduct;
           }
       }
        System.out.println("maxPriceItem +  = " + maxPriceItem  );
        System.out.println("maxPriceItem at index = " + productList.indexOf(maxPriceItem));

//
////        for (int i = 0; i < productList.size(); i++) {
////
////            // this is how we get each price part of items details
////            String priceStr = productList.get(i).split(",")[1];
////            // this is how we turn the priceString into double data type
////            double price = Double.parseDouble(priceStr);
////            int maxPriceIndex =0;
////            if (price > maxPrice) {
////                maxPrice = price;
////                maxPriceIndex = i;
////            }
////
////        System.out.println("maxPriceIndex = " + maxPriceIndex);
////        System.out.println("maxPrice = " + maxPrice);
////        System.out.println("expensive item detail = "
////             + productList.get(maxPriceIndex));
////
//            }
//        }
        System.out.println("maxPriceItem = " + maxPriceItem);
        System.out.println("productList.indexOf(maxPriceItem) = " + productList.indexOf(maxPriceItem));




    }
}
