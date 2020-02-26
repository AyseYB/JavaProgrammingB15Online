package day54.interface_as_reference;

public class Clothes implements Wearable {

    int size;

    public static void main(String[] args) {

        // try out all the polymorphic assignment
        // according to these relationship
        Wearable w1 = new Watch();
        Clothes c1 = new Clothes();
        Object o1 = new Object();
        //-------------------------------------
        Watch wa = new Watch();
        Wearable w2 = new Watch();
        Object o2 = new Object();
        //-------------------------------------
        Perfume p1 = new Perfume();
        Wearable w3 = new Perfume();
        Object o3 = new Perfume();
        //-------------------------------------
        MakeUps m1 = new MakeUps();
        Wearable m2 = new MakeUps();
        Cosmetic m3 = new MakeUps();
        Object m4 = new MakeUps();

    }

    @Override
    public void wear() {
        System.out.println("Wearing clothes");

    }
}

class Watch  implements Wearable{

    @Override
    public void wear() {
        System.out.println("Wearing Watches!!");

    }
}

class Perfume implements Wearable , Cosmetic{

    @Override
    public void wear() {
        System.out.println("Wearing Perfumes!!");

    }
}

class MakeUps implements Wearable, Cosmetic{

    @Override
    public void wear() {
        System.out.println("Wearing Makeups!!");
    }
}
