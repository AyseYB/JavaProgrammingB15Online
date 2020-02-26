package day51.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
        System.out.println("=======For each =============");
        Shape[] allShapes = {s1, s2, s3, s1, new Triangle(), s3};
        for (Shape each : allShapes){
            each.draw();
        }

        System.out.println("==========For loop =============");
        for (int i = 0; i < allShapes.length ; i++) {
            allShapes[i].draw();
        }
        System.out.println("--------For each with List-----------");

        // Quick way to create a List  --->> CAN WE ADD OR REMOVE ITEM FROM THIS SHORT WAY ? NO !!!
        //List<Shape> shapeList = Arrays.asList(s1, s2, s3, s2, s1);
        // this is a regular Arraylist object we can do anything with

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(s1);
        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        shapeList.add(s2);
        shapeList.add(s1);

        for (  Shape each : shapeList){
            each.draw();
        }
    }
}
