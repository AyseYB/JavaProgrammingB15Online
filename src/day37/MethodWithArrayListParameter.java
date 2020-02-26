package day37;

import java.util.ArrayList;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Guzelnurin");
        printAList(nameLst);


    }

    //Create a method that accept a list of String as argument
    // same thing as a method that has list of String parameter
    //and print out each and every item in the list vertically
    //return nothing

    /**
     *
     * @param lst
     */
    public static void printAList(ArrayList<String > lst){

        for (String each : lst) {
            System.out.println("each = " + each);

        }


    }
}

