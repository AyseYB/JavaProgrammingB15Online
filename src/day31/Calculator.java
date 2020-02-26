package day31;

public class Calculator {

    public static void main(String[] args) {

        // create a static method that add
        // it accept 2 numbers and print the result of addition
        add(6,22);
        add(16,3);
        add(14,3);
        add3Number(13,2,2);
        add3Number(12,3,3);
    }


    // a static method that has 2 int parameters
    public static void add( int num1 , int num2){
        System.out.println("addition result " + (num1+num2));

    }
    public static void add3Number(int num1, int num2, int num3){
        System.out.println("add 3 numbers result " + (num1+num2+num3));
    }
}
