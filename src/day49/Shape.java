package day49;

public abstract class Shape implements Drawable {

    String name;
    double area;

    public abstract void calculateArea();

    @Override
    public void draw(){
        System.out.println("Drawing " + name + " is fun !!");
    }

}