package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {
        //Print all the even numbers backward from 100 - 0
        //try to use if statement rather than -2
        //for example 100 - 98- 96 - 94 - 92 ...

        int numE = 100;
        while (numE>0) {
            if (numE % 2 == 0) {
                System.out.println(numE + " is even number");

            }
            --numE;


        }
    }
}