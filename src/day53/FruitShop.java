package day53;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet", "red", "Fuji");
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        Fruit f1 = a1;
        f1.getDigested();
        System.out.println(f1.toString());

        Fruit f2 = new Apple("Crispy but tasteless", "Hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("sour-sweet", "reddish", 10);

        Fruit[] myFruit = {f1, f2, f3, f4};
        for ( Fruit each : myFruit){
            each.getDigested();
        }
    }
}
