package day56;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("MacBook", 2999);
        Product p2 = new Product("sonyTV", 499);
        Product p3 = new Product("sonyTV", 499);

        System.out.println("p1 == p2" + (p1 == p2));
        System.out.println("p2 ==p3 : " + (p2 == p3));
        System.out.println(p2.equals(p3));
        System.out.println(p2.equals(p2));

        Product p4 = p3;
        System.out.println("p4.equals(p3) : " + p4.equals(p3));
    }
}
