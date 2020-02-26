package day32;

public class MethodWithReturnIntro2 {

    public static void main(String[] args) {

      String name= giveMeMyName();
        System.out.println("name = " + name);

     int num =doubleTheNUmber(5);
        System.out.println("num = " + num);
        int double4=doubleTheNUmber(4);
        System.out.println("double4 = " + double4);
        

        int sum =add(1,5);
        System.out.println("sum = " + sum);
        int add10to5=add(10,5);
        System.out.println("add10to5 = " + add10to5);

        System.out.println(divide(10,3));
        System.out.println(divide(10,0));
        System.out.println(divide(0,10));

        System.out.println(checkSeniorCitizen(45));
        System.out.println(checkSeniorCitizen(67));




    }
    // i want to create a static method called giveMeMyName
    // it returns your name as a result
    // it has no parameters
    public static String giveMeMyName(){

        return "Ayse";
    }

    // doubleTheNumber
    // create a static method that double the value of a number
    // it accept one int parameter and return doubled value of that number
    // whole purpose of writing a method that return a value
    // so we can save the result after calling the method
    // and use it somewhere else
  
public static int doubleTheNUmber (int num){
        int result=num * 2;
        return result;
}
    // create a method called add , accept 2 int parameter
    // and return the result as int
    //
    public static int add(int num1, int num2){
        int sum =num1+num2;
        return sum;
    }

    /**
     * create a method called divide
     * it has 2 double parameters and return the result as double
     *  @param num1
     * @param num2
     * @return
     */

    public static double divide(double num1, double num2){
        // to avoid to get the result we did not wanted
        if (num2==0){  // we check if num2 is 0
            return 0;  // if it is we just return 0.0
        }else{         // if not ,
            return num1/num2;
        }


    // return num1/num2;
    }

    // create a method called checkSeniorCitizen that return String

    /**
     * @param age
     */
    public static boolean checkSeniorCitizen(int age){
        if(age > 65)
        return age >=65;
        return false;
    }


}
