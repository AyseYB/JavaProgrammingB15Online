package day05;


import java.util.Scanner;

class ScannerPractice_NextBoolean {

    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        // asking user are yor recording
        System.out.println( " are you recording?");
        boolean isRecording = input.nextBoolean();

        // the result of concatenationg a string to any data type --->> string

        System.out.println(" We are recording " + isRecording);



    }
}
