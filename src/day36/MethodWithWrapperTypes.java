package day36;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {
        Integer i1 = 12;
        Integer i2 = 20;
        sumAndPrint(i1 ,i2);
        sumAndPrint(23,1);
        printTheDoubleValue(5);
        printTheDoubleValue(new Integer(10));


    }

    /**
     *
     * @param num1 type Integer , first number to add
     * @param num2 type Integer, second number to add
     */
    public static void sumAndPrint(Integer num1, Integer num2){

        System.out.println(  num1 + num2  );

    }
    public static void printTheDoubleValue(int x){
        System.out.println("after doubling x = " + (x*2));
    }
}

