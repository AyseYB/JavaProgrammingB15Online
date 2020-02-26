package day34;

public class MathActionFromJDK {

    public static void main(String[] args) {

        //where is string class coming from?
        // it is coming from a package called java.lang
        // it is a special  package
        // and any class in it does not need importing when being used
        //for example Sting class

        //what if i really want to explicitly import String class
        //import java.lang.String
     //   String str = "Hello";

        // there is a class under java.lang called Math
        //and it has lots of math utility methods that ready to used
       int sum= Math.addExact(10,20);
        System.out.println("sum = " + sum);

        Math.max(10,20);
        System.out.println("max of 10, 20 -->> " + Math.max(10,20) );
    }


}

