package day48;

public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo k1 = new Kangaroo("COCO", 8);
        k1.kickBox();
        k1.carryChildInThePocket();
        k1.eat();
        k1.bounce();
        k1.toString();

        Bouncible b1 = new Kangaroo("toto", 8);
        b1.bounce();
    }

//    public static void main(String[] args) {
//
//        Kangaroo k1 = new Kangaroo("COCO", 10);
//        System.out.println("k1 = " + k1);
//        k1.bounce();
//        k1.eat();
//        k1.carryChildInThePocket();
//        k1.kickBox();
//
//        // SuperType variableName = new SubType(....) ;  THIS WORKS
//        // THIS WILL BE EXPLAINED MUCH IN DETAIL IN IT'S OWN DAYS
//        //List<Integer> lst = new ArrayList<>();
//        Bouncible k2 = new Kangaroo("Toto", 6) ;
//        k2.bounce();
//
//        Bouncible b2 = new Ball("Round", "purple");
//        b2.bounce();
//
//        Ball b1 = new Ball("Round", "Blue");
//        b1.bounce();
//
//    }

}
