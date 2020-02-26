package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        System.out.println("The Start");
        String name = "Furkan";
     //   System.out.println("number 100 char of name is " + name.charAt(100));

      //  StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
      //  System.out.println("e1.toString() = " + e1.toString());

        Scanner scan = new Scanner(System.in);
        System.out.println("which character index you want from Furkan's name");
        try{
           int targetIndex = scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            System.out.println("end of try");

        } catch (StringIndexOutOfBoundsException e){
            //System.out.println("Message from getMessage method" +
           // e.getMessage());
            System.out.println("you are out of bound!!! ");
            System.out.println("Enter between 0 and " + name.length());
           // System.out.println("Something unusual happened");

        } catch (InputMismatchException bla){
            System.out.println("Input mismatch , enter number");
        } catch (Exception e){
            System.out.println("IF I DONT CATCH ABOVE 2 TYPES , I WILL COME HERE !!");
        }
       // System.out.println("Name = " + name);
        System.out.println("the end");
    }


}
