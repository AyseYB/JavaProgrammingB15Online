package day49;

public class Circle extends Shape{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = 3.14 * radius * radius;
        System.out.println("Circle calculate area = " + area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        c1.calculateArea();

        Square s1 = new Square(4);
        s1.calculateArea();

      //  Circle c2 = new Square(3); compiler error

    }
}
