package day52.Polimorphism;


import day50.Drawable;

public class ShapePolymorphism {

    public static void main(String[] args) {

       // Circle s1 = new Circle("Penny", 5);
      //  Shape s1 = new Circle("Penny",5);
       Object s1 = new Circle("Penny",5);
      //  Drawable s1 = new Circle("Penny", 5);


        // ONLY THE REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABE
      //  s1.draw();
        //s1.draw();
        System.out.println(s1.toString());

        //How do I know is the actual object type
        System.out.println(s1.getClass().getSimpleName());


        // create a method that accept any Shape and print out the calculated area

    }
    public static void printAnyShape(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.name + " 's area is = " + anyShape.area);
    }
}
