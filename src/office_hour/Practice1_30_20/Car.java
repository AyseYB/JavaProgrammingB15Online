package office_hour.Practice1_30_20;

public abstract class Car {
    // public abstract return-type  methodName();

    public abstract void start();
}

class Toyota extends Car{

    @Override
    public void start(){
        System.out.println("Push button");
        System.out.println("Start engine");
    }
}


class Jeep extends Car {

    @Override
    public void start(){
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");

    }
}

abstract class ElectricCars extends Car{

    public abstract void hasBattery();
    //there is
}

class Tesla extends ElectricCars{
    @Override
    public void hasBattery(){
        System.out.println("Tesla has battery");
    }

    @Override
    public void start(){
        System.out.println("Say Start");
        System.out.println("start engine");
    }

}
class Test {

    public static void main(String[] args) {

        Jeep j1= new Jeep();
        j1.start();
        System.out.println("====================");
        Toyota t1 = new Toyota();
        t1.start();
        System.out.println("=====================");
        Tesla t2 = new Tesla();
        t2.start();



    }
}
