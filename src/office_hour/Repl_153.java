package office_hour;

import java.util.Scanner;

public class Repl_153 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {
        //your code here


            String[] splitTheArray = info.split(",");
            System.out.println(" person name: " + splitTheArray[0] + " last name: "
                    + splitTheArray[1] + " age: " + splitTheArray[2]);



//    The method person get a string with this format : "name,last name,age"
//            for example:
//
//    person("jon,doe,30");
//
//    the output is:
//
//    person name: jon last name: doe age: 30
//
//    hint: use the split method to split the string to a string array where there is a "," char
}}
