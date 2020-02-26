package day62;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {

    public static void main(String[] args) {

        //set is a data structure to store unique element
        //IT DOES NOT KEEP INSERTION ORDER
        //IT DOES NOT HAVE INDEX

        //HashSet implement set interface and always default choice

        Set<Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(12);
        myNums.add(13);
        myNums.add(76);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums = " + myNums);


    }
}
