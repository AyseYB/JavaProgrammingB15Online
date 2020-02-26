package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        // how do we implement a lifoQueue if not using old class called Stack
        //we can use any of Deque interface implementation
        //deque is a double ended Queue so we can add item as always
        //and when
        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("say bye to Java");

        System.out.println("lifoQue = " + lifoQue.removeLast());
        System.out.println("lifoQue = " + lifoQue.removeLast());
        System.out.println("lifoQue = " + lifoQue.removeLast());
        System.out.println("lifoQue = " + lifoQue.removeLast());
    }
}
