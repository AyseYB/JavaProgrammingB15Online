package day19;

import java.util.Scanner;

public class WarmUp_SpeedUp2 {

    public static void main(String[] args) {

//        for( int i =1; i<= 10; ++i){
//            System.out.print(i + " ");
//        }
//        System.out.println( );
//        for( int n =10; n>= 1 ; --n){
//            System.out.print(n + " ");
//        }
//
//        int start = 5;
//        int end = 19;
//
//        for ( int s = start; s <= end ; ++s){
//            System.out.println("Increaseing " + s);
//        }

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Enter starting and ending speed");
//        int start = scan.nextInt();
//        int end = scan.nextInt();

//        for( int s = start; s<=end ; ++s){
//            System.out.println(" your speed is increasing like this " + s);
//        }

//        if(start < end){
//            System.out.println("Increasing");
//            for (int sI = start; sI <= end ; ++sI){
//                System.out.println(sI + " ");
//            }
//        }else if(end < start){
//            System.out.println("Decreasing");
//            for (int sD = start ; sD >= end ; --sD){
//                System.out.println(sD);
//            }
//        }
        String line ="";
        for (char iChar = 'A' ; iChar <= 'Z' ; ++iChar){
            line += iChar;
           // System.out.print(iChar + " "); it only prints the alphabet once from a to Z
          //  System.out.println(line); // this line makes it stair
        }

        char myChar = 'A';
        for( char mychar ='A' ; myChar<= 'Z' ; ++myChar){
            System.out.print(myChar + " ");
        }
        System.out.println();
        for (char myChar2 ='Z' ; myChar2>= 'A' ; --myChar2){
            System.out.print(myChar2 + " ");
        }


















    }
}
