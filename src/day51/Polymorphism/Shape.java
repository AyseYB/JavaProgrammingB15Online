package day51.Polymorphism;

public abstract class Shape {

    public abstract void draw();

}

class Triangle extends Shape{

    public void draw(){
        System.out.println("Drawing Triangle");
    }
}

class Rectangle extends Shape{

    public void draw(){
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape{

    public void draw(){
        System.out.println("Drawing circle");
    }
}