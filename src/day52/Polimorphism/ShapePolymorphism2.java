package day52.Polimorphism;

public class ShapePolymorphism2 {

    public static void main(String[] args) {

        Shape s1 =new Circle("penny", 5);
        printAnyShape(s1);

        Shape s2 = new Rectangle("book",10, 5 );
        printAnyShape(s2);
        // here we are directly passing the sub class object
        // to a method that have Shape as parameter type
        printAnyShape(new Square("Bob", 6));

        drawShape3Times(s1);
        drawShape3Times(new Square("box", 4));



    }

    public static void drawShape3Times(Shape anyShape){
       anyShape.draw();
       anyShape.draw();
       anyShape.draw();

    }

    public static void printAnyShape(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.name + " 's area is = " + anyShape.area);
    }
}
