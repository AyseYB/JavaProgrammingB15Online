package day41;
//Make this product a well encapsulated
// make all the instance fields privets
public class Product {

    private String name ;
    private double price ;

    public String  getName(){
       return name;
    }
    public void setName(String newName){
        name= newName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        if(newPrice >0){
            price = newPrice;
        }

    }



}

