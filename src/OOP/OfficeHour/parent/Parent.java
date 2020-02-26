package OOP.OfficeHour.parent;

import java.security.PublicKey;

public class Parent {

    String name;
    int age;
    int SSN;

    //constructor
    public Parent(String fullName, int age, int SSN){
       name = fullName;
       this.age = age;
       this.SSN = SSN;
    }

    public void cookFood(String foodName){
        System.out.println(name + " is cooking " + foodName);
    }

    //method --> Action
    //void return

    public static void hi(){
        System.out.println("Hi, how are you?" );
        //call void method
    }


    public static void hi(String name){
        hi();
    }

//    public static String hi(String name){
//        return "Hello" + name;
//    }

    public static String hello(){
        return "Hello, hello";
    }

    public static void main(String[] args) {
        //call void method --- call by name
      //  hi();

        // call return method --> 2 ways to call it
        System.out.println(hello());

        // 2nd way;
        String greeting = hello();
        System.out.println(greeting);

        String word = "Java";
        System.out.println(word.length());





    }


}
