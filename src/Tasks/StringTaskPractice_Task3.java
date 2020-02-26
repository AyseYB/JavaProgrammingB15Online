package Tasks;

import java.util.Scanner;

public class StringTaskPractice_Task3 {

    public static void main(String[] args) {

//   Task 3:
//Ask user to enter full name
//assuming full name is 2 word
//Write a program to print users initials
//for example :
//Jon Snow -->> Initial is JS
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName =scan.nextLine();
        //find out index of space and next index will be last name first character
        int lastCharOfIndex = fullName.indexOf(" ")+1;
        String initials =fullName.charAt(0) + " " + fullName.charAt(lastCharOfIndex);
        System.out.println(initials);










    }
}
