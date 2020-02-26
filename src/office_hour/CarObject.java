package office_hour;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.color ="White";
        car1.mileage =10000;
        car1.model ="X6";
        car1.price = 15000.5;
        car1.year= 2000;
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.mileage);
        System.out.println(car1.model);
        System.out.println(car1.price);
        System.out.println(car1.year);

        System.out.println("================");
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.color = "black";
        car2.mileage = 150000;
        car2.year = 2002;
        car2.price = 2000;
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.year);
        System.out.println(car2.mileage);
        System.out.println(car2.color);


        car1.getInfo();
        car2.getInfo();

        Car car3 = new Car();
        car3.brand = "Lexus";
        car3.model = "RX350";
        car3.year = 2020;
        car3.mileage = 25000;
        car3.color = "Purple";
        car3.price = 40000;

        car3.getInfo();



    }
}
