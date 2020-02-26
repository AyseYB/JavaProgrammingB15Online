package day49;


public class Tesla extends Vehicle implements Autonomous{

    int horsePower;
    String model;

    @Override
    public void start() {

    }
    @Override
    public void selfDrive(){
        System.out.println("Tesla self driving");
    }

    public Tesla(int horsePower, String model) {
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Tesla t1 = new Tesla(2000, "bmr");
        t1.goForward();
        t1.start();
        t1.selfDrive();

    }
}
