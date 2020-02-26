package office_hour;

import java.util.Scanner;

public class Repl_101 {

    public static void main(String[] args) {

//        Given a string, print out true if the number of appearances of "java" anywhere in the string
//        is equal to the number of appearances of "python" anywhere in the string (case sensitive).
//        Example:
//        input: We study java not python
//        output: true
//
//        Example:
//        input: What's the difference between java, javascript and python?
//        output: false

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countOfJava = 0;
        int countOfPython= 0;

        for(int i = 0 ; i < sentence.length()-4 ; i++){
            String current4 = sentence.substring(i, i+4);
            if(current4.equals("java")){
                ++countOfJava;
            }
        }
        System.out.println(countOfJava);

        for(int x = 0 ; x < sentence.length()-6 ; x++){
            String current6=sentence.substring(x,x+6);
            if(current6.equals("python")){
                ++countOfPython;
            }
        }
        System.out.println(countOfPython);

        System.out.println(countOfJava == countOfPython);










    }
}
