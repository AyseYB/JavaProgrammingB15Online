package day45;

public class Fruit {

    // ALWAYS ADD NO ARG CONSTRUCTOR IN SUPER CLASS
    // TO AVOID UNNECESSARY ERROR OF SUB CLASS CALLING
    // SUPER CLASS'S NO ARG CONSTRUCTOR
    public Fruit(){
        System.out.println("No arg Fruit Constructor message");
    }

    public Fruit(String str){
        System.out.println("One arg Fruit Constructor");
    }

}
