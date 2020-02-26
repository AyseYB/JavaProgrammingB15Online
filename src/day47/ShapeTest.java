package day47;

import java.awt.*;

public class ShapeTest {

    public static void main(String[] args) {

        Triangle t1 = new Triangle("My triangle", 4, 3);
        t1.calculateArea();
        t1.toString();

        Rectangle r1 = new Rectangle("my rectangle", 3, 5);
        System.out.println("before r1 " + r1);
        r1.calculateArea();
        System.out.println("after the calculate " + r1);

    }
}
