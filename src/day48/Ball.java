package day48;

//public class Ball implements Bouncible {
//
//    String shape;
//    String color;
//
//    public Ball(String shape, String color){
//        this.color = color;
//        this.shape = shape;
//    }
//
//    @Override
//    public String toString() {
//        return "Ball{" +
//                "shape='" + shape + '\'' +
//                ", color='" + color + '\'' +
//                '}';
//    }
//
//    @Override
//    public void bounce() {
//        System.out.println("This " + shape + " and " + color +
//                " ball is bouncing if gravity is " + GRAVITY);
//    }
//}

public class Ball implements Bouncible{
    String shape;
    String color;

    public Ball (String shape, String color){
        this.shape = shape;
        this.color =color;
    }


    @Override
    public void bounce(){
        System.out.println("Ball is bouncing");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
