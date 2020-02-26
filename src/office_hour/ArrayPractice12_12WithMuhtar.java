package office_hour;

import java.util.Arrays;

public class ArrayPractice12_12WithMuhtar {

    public static void main(String[] args) {

        /**
         * Array; one of the data structure in java
         * we need data structure to manage data efficiently, int organized manner
         * we can store multiple data into a variable
         * int a = { 10, 20 } ====>>WRONG
         *
         */

//Tasks:
//    1.  Write a program that can print out the unique values from an int Array
//        Ex:
//            if arr -> {1,1,2,3,3}
//              output: 2
        int[] numbers = {1, 1, 2,0, 3, 4, 4, 5,99999, 4,2, 5, 1, 99,1, 1 ,9,9, 8, 7 ,5,8,7, 3};

        for(int j = 0; j <numbers.length; j++) {
int count=0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    ++count;
                }
            }

            if (count == 1) {
                System.out.print(numbers[j] + ", is unique ");
            }

        }
        System.out.println("\n=============================");
//        for (int x = 0; x < numbers.length; x++) {
//            int count = 0;
//            for (int i = 0; i < numbers.length; i++) {
//                if (numbers[i] == numbers[x]) {
//                    ++count;
//                }
//            }
//
//            if (count == 1) {
//                System.out.print ( numbers[x] +" ");
//            }

        //}
// 2. Write a program that can print out the unique values from  String Array
//        Ex:
//            if arr -> {"a" , "a ", "b", "c", "c"}
//                output: b
        System.out.println();
        String[] arr = {"a", "d", "b", "c", "c"};
//        for(int j = 0 ; j < arr.length ; j++) {
//
//            int countUniqueLetter = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].equals(arr[j])) {
//                    ++countUniqueLetter;
//
//                }
//            }
//            if (countUniqueLetter == 1) {
//                System.out.println(arr[j]);
//            }
//        }
        Arrays.sort(arr);
        for(int j = 0 ; j< arr.length ; j++) {
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(arr[j]);
            }

        }
        System.out.println("\n===========finding second max number=================");

//        3. Write a program that can find the second max number from an int array
//        Ex:
//            if arr -> { 1,2,3,4,5}
//                output: 4
//            DO NOT use sort method

        int[]grades={1, 2, 3, 4, 5, 6, 7, 8};
        int max =grades[0];
        for ( int eachGrade : grades){
        if (eachGrade>max){
            max=eachGrade;
        }
    }
        System.out.println(max);

        int secondMax =grades[0];
        for (int eachGrade  : grades){
            if(eachGrade==max){
                continue;
            }
            if(eachGrade>secondMax){
                secondMax=eachGrade;
            }
        }
        System.out.println("second max number " + secondMax);

        System.out.println("======= Swap without temporary variable ====");
//        4. Swap two variable' values without using a temporary variable
//        Ex:
//        if a =10, b= 20;
//        output: print( a ) ==> 20
//        print( b ) ==> 10
        int a = 10;
        int b = 20;

        a = a + b ; // a = 30
        b= a - b ; // b= 10
        a= a- b;
        System.out.println(a + " " +b);

        String[] happyString = new String[10];
        for(int i = 0 ; i < happyString.length; i++){
            happyString[i]="I love Java";
        }
        System.out.print(Arrays.toString(happyString) + " ");




    }}
