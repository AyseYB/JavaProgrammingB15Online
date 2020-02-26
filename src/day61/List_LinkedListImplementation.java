package day61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {

    public static void main(String[] args) {

        //List<String> lst = new ArrayList<>();
        List<String> lst = new LinkedList<>(); // it is like folclore dance, holding hands
        lst.add("Zeynep");
        lst.add("Ershad");
        lst.add("Kamira");
        lst.add("Sabira");

        System.out.println("lst = " + lst);
        lst.remove("Ershad");
        System.out.println("lst = " + lst);





    }
}
