package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
    private List<Product> allProducts ;

    public int indexOfProduct(Product p){
        return allProducts.indexOf(p);
    }

    public boolean checkIfProductExists(Product p){
        return allProducts.contains(p);
    }

    public void displayProducts(){
        System.out.println(name + "'s store has these items");
        for(Product each :  allProducts){
            System.out.println("\t each = " + each);
        }
    }

    public int getProductCount(){
        return allProducts.size();
    }

    public void addProduct(Product p){

        System.out.println("Calling addProduct (Product p)");
        allProducts.add(p);
    }

    public void addProduct(String productName, int productPrice){

        Product newP = new Product(productName, productPrice);
        allProducts.add(newP);
    }

    public Store(){
        this.name = "Cybertek Store";
        this.allProducts = allProducts; // store has list of products
    }
    //2 Arg constructor to accept List<Product>
    //First line of constructor should call no arg constrrcutor to refuse initialization logic.
    public Store(String name, List<Product> otherList) {
       this(); //calling no arg constructure here
        this.name = name;
        allProducts.addAll(otherList);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
//create a class called Store
//It has List<Product> as instance variable
//no arg constructor to initilize the list to empty ArrayList object
//1 Arg constructor to accept List<Product>
//First line of constructor should call nonath constructor to reuse initialization logic.
//Inside constructor AddAll Products user passed to the instance variable last.
//Create an instance void method called addProduct(Product p)
//Create an instance void method called removeProduct(Product p)
//Create an instance void method called checkIfProductExist(Product p)
//Hint : just call list remove method, it will internally call .equal method to decide which one to remove
//more methods : find and return max price product, Find sum.of all products
//Find list of products more than average