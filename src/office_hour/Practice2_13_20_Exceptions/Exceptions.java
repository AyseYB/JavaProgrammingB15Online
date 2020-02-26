package office_hour.Practice2_13_20_Exceptions;

public class Exceptions {

    //Exceptions :Unexcpected or unwanted events
    //unchecked exception (Unexcepted);only occurs during runtime

    //checked exception(unwanted ): occurs during compile time

    /**
     *
     * Exception handlings
     * 1= try&catch : blocks used for handling exception
     * try{
     *
     * }
     */
    public static void main(String[] args) {

        String str = "Batch15";
        try {
            char ch1 = str.charAt(10);  // unchecked exception
            System.out.println(ch1);
        } catch (StringIndexOutOfBoundsException e) { // we either give the specific class or its super class
            System.out.println("String Index Out Of Bounds Exception");
        }
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("test completed");

        try {
            printHello();
        }catch (Exception e){

        }

    }

    public static void printHello() throws InterruptedException{ //throws keyword must be used withing method signature
        Thread.sleep(3000);
        System.out.println("Hello");
    }
}
