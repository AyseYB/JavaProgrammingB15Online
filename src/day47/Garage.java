package day47;

public class Garage {

    public static void main(String[] args) {
        // Abstract class can not be instantiated
        // It means we can not create object out of it
     // Car c1 = new Car()

        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goBackword();
        c1.goBackword();
        c1.turn("right");


        // Create another sub class of Car called GasCar
        // add a instance field called gasLevel as int
        // implements all the abstract method of Car class
       GasCar c2 = new GasCar();
       c2.start();
       c2.goForward();
       c2.goBackword();
       c2.turn("left");

    }
}
