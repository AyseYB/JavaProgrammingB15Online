package day39;

public class Car {

    //year , model , make , color
    String name;
    String model;
    String color;
    String make ;
    int year ;
    // or in one shot
    // String model , make , color

    public void GoForward (){
        System.out.println(make + " Going Forward");
    }

    // Create a method to print how old is this car
    public void printCarAge (){
        System.out.println("car age = " + (2020 -year));
    }

    // create a method to change the color
    public void changeTheColorTo (String newColor){
        // Write bunch of code here to validate
        // user is actually passing correct color
        // for example  Red , Blue is valid color
        //              ABC , EFG is not valid color
        System.out.println("new color = " + newColor);
    }

// instance methods are tied to the object
    // it does not have have static keyword
    // we need an object when we call them




}
