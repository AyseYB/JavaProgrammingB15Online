package day50;

import day49.Circle;

public class Main {

    public static void main(String[] args) {

        Square s1 = new Square("My Precious", 10);
        System.out.println("s1 without calculation " + s1);
        s1.calculateArea();
        System.out.println("s1  with area calculation = " + s1);
        s1.draw();
        Circle c1 = new Circle(3);
        c1.calculateArea();
       // c1.draw();

    }
}
