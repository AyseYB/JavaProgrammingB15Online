package day15;

public class ReplaceMethod {

    public static void main(String[] args) {

        //replace method of the String
        // it will go through all part of string and replace
        String message = "I love the Pumpkin, Pumpkin is fun";
        message.replace("Pumpkin", "Java");
        System.out.println(message);

        message = message;
        System.out.println(message);

        String message2="Happy Thanks Giving to ALL !!";
        //Happy Thanks Giving to ALL !!--->>"Happy Thanksgiving to ALL !!"
        message2 = message2.replace("Thanks Giving","Thanksgiving");
        System.out.println("message2 = " + message2);
         message2 = message2.replace("!!", "!");
        System.out.println("message2 = " + message2);
        String message3 = "TOMORROW IS NO OFF";
        message3=message3.replace("NO"," ");
        System.out.println(message3);




    }
}
