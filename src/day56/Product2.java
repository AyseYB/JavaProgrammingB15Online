package day56;

public class Product2 extends Object {

    String name;
    int price;
    public Product2(String name, int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj){
        Product2 otherProduct = (Product2) obj;
       return this.name.equals(otherProduct.name)&&this.price == otherProduct.price;
    }





    @Override
    public String toString() {
        return "Product2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Product2 p2 = new Product2("Baloon", 4);
        Product2 p3 = new Product2("Baloon", 4);
        System.out.println("p2 == p3 = " + p2.equals(p3));
    }
}
