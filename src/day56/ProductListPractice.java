package day56;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class ProductListPractice {

    // How does contains decide you have an object you are looking for in your list ?
// it will call .equals method of that type , if it's overridden to check for content
// then it will return desired result according to the content (attributes)
// else it will always return false

// same thing for remove ? how can i remove an item from the list using remove method that accept object ?
// first it decide whether you have that object or not by checking using contain method .
// if you have it then you remove ,  if contains return false you can not remove because we cant remove what we don't have

    public static void main(String[] args) {

     List<Product> productList = new ArrayList<>();
     productList.add( new Product("Macbook Pro", 2999) ) ;
     productList.add( new Product("Sony TV", 499) ) ;
     productList.add( new Product("Macbook Air", 1299) ) ;
     productList.add( new Product("Iphone X", 999) ) ;
     productList.add( new Product("Iphone XL", 1299) ) ;
     productList.add( new Product("Sumsung 10", 499) ) ;
     productList.add(new Product("Samsung Note", 1288));

     System.out.println("Product list size " + productList.size());

     Product sony =new Product("Sony TV", 499);
     boolean result = productList.contains(sony);
     System.out.println("Has Sony TV , with 499 or not result = " + result);

        System.out.println("productList.indexOf(\"Sony TV\") = " + productList.indexOf(sony));


        productList.remove(sony);
    System.out.println("After removing sony " + productList.contains(sony));







    }




}