package day36;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

//        // IT WILL ONLY STORE OBJECT!!! NOT PRIMITIVE
//        //ArrayList<int> lst2 = new ArrayList<>()

        // Correct way to create arraylist object that store whole number
        // is to use Wrapper class type . Primitive type is FORBIDDEN!!!!

//
        ArrayList<String > lst1 =new ArrayList<>();

        ArrayList<Integer> lst3 =new ArrayList<>();

        ArrayList<Double> lst4 = new ArrayList<>();

        // OPTIONALLY YOU CAN CREATE IN THIS WAY

        // List is a more general data type  compared to ArrayList is more concrete data type
        // ArrayList is one type of List
        // Just like Dog is one type of Animal
//        List<String> myLst = new ArrayList<>();
//        List<Integer> myLst2 = new ArrayList<>();
    }
}
