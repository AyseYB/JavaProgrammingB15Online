package office_hour.Practice2_04_20;

public class Samsung extends Device {

    String color;

    public void call(){
        System.out.println("Calling with Samsung");
    }

    public void sendMessage(){
        System.out.println("Sending message with " + color+ "Samsung");
    }


}
