package office_hour;

import java.util.Scanner;

public class Repl_162 {

    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            fib(num);
        }

        public static void fib(int num){
            //WRITE YOUR CODE HERE
            int num1= 0;
            int num2= 1;
            int result = 0;
            if(num==0){
                result=0;
            }
            if(num ==1){
                result=1;
            }
            for (int i = 0; i <= num  ; i++) {
                result = num2+num1;
            }
            System.out.println("result = " + result);
        }
}}
//Complete a method fib() that will compute Fibonacci numbers
//Complete a method fib() that will compute Fibonacci numbers
//In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of the Fibonacci series are 0 and 1.
//You are given a number num, print n-th Fibonacci Number.
//Input  : 2
//Output : 1
//(Explanation : beacuse number 2 in the sequence of 0, 1 --> 1)
//
//Input  : 9
//Output : 21
//(Explanation : beacuse number 9 in the sequence of
//  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
//
//
//
//Input  : 2
//Output : 1
//(Explanation : beacuse number 2 in the sequence of 0, 1 --> 1)
//
//Input  : 9
//Output : 21
//(Explanation : beacuse number 9 in the sequence of
//  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
