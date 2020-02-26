package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {
        String name = giveMeMyName();
        System.out.println("name = " + name);
        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

      //  System.out.println(Arrays.toString(arrayObjectHere));
        //just like we can directly use the toString
        //we can print and result of a method call directly , if the method return a value
        System.out.println("result of doubling 100 is " + doubleTheNumber(100));
        System.out.println(doubleTheNumber(5));
        System.out.println(doubleTheNumber(15));

        int add14to16Result = add2Number(14,16);
        System.out.println("add14to16Result = " + add14to16Result);

        System.out.println(add2Number(14, 16));


    }
    //create a method called add , accept 2 int parameter
    //and returm the result as int

    public static int add2Number(int num1, int num2){

        return num1 + num2 ;

    }



    //double the number
    //create a static method that double the value of a number
    //it accept one int parameter and return doubled value of that number
    //whole purpose of writing a method that return a value
    //so we can save the result after coling the method and use it somewhere else
    public static int doubleTheNumber( int num){
        System.out.println(" i am going to double the value of num " + num);
        int result = num * 2 ;
        return result;
    }

    //I want to create a static method call giveMeMyName
    // it returns your name as a result
    //it has no parameter
    public static String giveMeMyName(){

        return "Ayse";

    }
}
