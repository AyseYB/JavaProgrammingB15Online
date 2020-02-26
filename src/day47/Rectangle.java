package day47;

//public class Rectangle extends Shape {
//
//    int width;
//    int height;
//
//    public Rectangle(int width, int height){
//        // I want to set the name to word Rectangle;
//        // i am reusing the functionality of super class
//        // to set the name to rectangle
//      super("my rectangle");
//      this.height= height;
//      this.width = width;
//    }
//
//    @Override
//    public void calculateArea(){
//        area = width *height;
//    }
//
//    @Override
//    public String toString() {
//        return "Rectangle{" +
//                "width=" + width +
//                ", height=" + height +
//                ", name='" + name + '\'' +
//                ", area=" + area +
//                '}';
//    }
//}
public class Rectangle extends Shape{

   int width;
   int height;

    public Rectangle(String name, int width, int height) {
        // I want to set the name to word Rectangle;
        // i am reusing the functionality of super class
        // to set the name to rectangle
        super("My rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
