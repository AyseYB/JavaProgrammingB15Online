package day48;

public class Kangaroo implements Bouncible, BoxerWithBellyPouch{

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println("this" + name + " can jump " + GRAVITY + jumpDistance + " jump distance");
    }

    public void eat(){
        System.out.println("Kangaroos love eating vegetables");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name " + name + " is kickBoxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name " + name + " carry child in the pocket");
    }
}

//public class Kangaroo implements Bouncible, BoxerWithBellyPouch {
//
//    String name;
//    int jumpDistance;
//
//    public Kangaroo(String name, int jumpDistance){
//        this.name = name;
//        this.jumpDistance = jumpDistance;
//    }
//
//    public void eat(){
//        System.out.println("Kangaroo with name " + name + " is eating ");
//    }
//
//    @Override
//    public String toString() {
//        return "Kangaroo{" +
//                "name='" + name + '\'' +
//                ", jumpDistance=" + jumpDistance +
//                '}';
//    }
//
//
//
//    // this is the method we have override from Bouncible interface
//    @Override
//    public void bounce() {
//
//        System.out.println("This " + name + " can jump " + jumpDistance
//                + " meters forward and it would be nice to have " + GRAVITY + " gravity");
//    }
//
//    //these two method, we are overriding from BoxerWithBellyPouch
//    @Override
//    public void kickBox() {
//        System.out.println("Kangaroo with name " + name + " is kickBoxing");
//    }
//
//    @Override
//    public void carryChildInThePocket() {
//        System.out.println("Kangaroo with name " + name + " carry child in the pocket");
//    }
//}
