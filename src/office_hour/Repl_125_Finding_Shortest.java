package office_hour;

import java.util.Scanner;

public class Repl_125_Finding_Shortest {

    public static void main(String[] args) {

//Write a program that will print the shortest word in the given array str.
//
//input: java, cable, red, vivid, remedy, grace
//output: red
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String shortestWord =str[0];
        for(int i = 0; i < str.length ; i++){
            if(str[i].length()< shortestWord.length()){
                shortestWord=str[i];

            }
        }
        System.out.println(shortestWord);

      String min = str[0];
      for( String  eachWord : str){
          if(eachWord.length() < min.length()){
              min=eachWord;
          }
      }
        System.out.println(min);








    }
}
