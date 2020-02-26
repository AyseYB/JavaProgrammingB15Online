package day49;

public class Square extends Shape {

    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        area= length * length;
        System.out.println("this is the area of the square " + area);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

}
