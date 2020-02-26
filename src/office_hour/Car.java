package office_hour;

public class Car {

    String model;
    int year;
    String color;
    double price;
    long mileage;
    String brand;


    public void drive(){
        System.out.println("Driving " + brand);
    }
    public void start(){
        System.out.println(brand + " is started ");
    }
    public void getInfo(){
        System.out.println(year + " " + brand + " " + model +
                color + ", " + mileage + ", $ " + price);
    }


}
