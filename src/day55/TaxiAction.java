package day55;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6", 400);
        Driver d = new Driver("Pedro", 12345);
        //how to get a first character of the name of the driver
        d.name.charAt(0);

        Taxi t1 = new Taxi(101, en, d);

        System.out.println("t1 = " + t1);
        System.out.println("t1.toString() = " + t1.toString());

        //how do I store the t1 plate number in a variable x :
        int x =t1.plateNumber;

        //how do I store the t1 Driver field in variable y;
        Driver y = t1.dr;

        // how do I store the t1 Engine field in a variable z;
        Engine z = t1.eng;

        //how do I get the name of the driver using t1
        System.out.println("Driver name " + y.name);
        System.out.println("Driver name " + t1.dr.name);

        //how do I get the horse power of the t1
        System.out.println("Engine horse power " + en.horsePower);

        System.out.println(t1.dr.name.charAt(0));
    }
}
