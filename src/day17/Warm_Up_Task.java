package day17;

public class Warm_Up_Task {

    public static void main(String[] args) {

        //Create a String varianle to store your name in any case combination
        //for example jon jOn jON any of them

        //create a variable called name2
        //make your first letter uppercase then rest lowercase
        //jon -
                    //01234567
        String name ="kHumAyRa";

        //substring method copy the part of String inside another String
        //it has 2 version

        //get the first character--->>make it upperCase
        //get the rest of the characters starting from 2nd character
        //then make it lowercase
        //eventually concatenate them
       // String nameFixed = (name.charAt(0) +"").toUpperCase();
            //   nameFixed = nameFixed + name.substring(1).toLowerCase();

               String nameFixed=name.toUpperCase().substring(0,1);
               nameFixed += name.substring(1).toLowerCase();
        System.out.println("name fixed = " + nameFixed);

//
        //make whole name uppercase the get
        //get the rest of the characters starting from 2nd character

    }
}
