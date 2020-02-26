package office_hour;

import java.util.Scanner;

public class Practice_11_20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("What is your age?");
         int age = scan.nextInt();
         scan.nextLine(); // this line helps to capture the next line
        System.out.printf("what is your full name?");
        String fullName = scan.nextLine();
        System.out.printf("Your name is " + fullName + " , your age is " + age);
    }

}
