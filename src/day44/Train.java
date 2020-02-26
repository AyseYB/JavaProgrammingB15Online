package day44;

public class Train extends Vehicle {


    int wagonCount;

    public void makeChoChoSound(){
        System.out.println("CHOOO CHOOO");
    }


    public static void main(String[] args) {

        Train t1= new Train();
        t1.makeChoChoSound();
        t1.make = "Thomas";
        t1.setYear(1999);
        System.out.println(t1.getYear());
       // t1.year = 1999;
        //calling the method we got from vehicle
        t1.start();
        t1.goForward();

    }




}
