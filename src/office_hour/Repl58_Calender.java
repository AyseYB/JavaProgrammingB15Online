package office_hour;

import java.util.Scanner;

public class Repl58_Calender {

    public static void main(String[] args) {
//        Display message: "Enter month number:"
//        input: 5
//        Display message: "May"
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter month number");
        int month = scan.nextInt();
        switch (month){
            case 1:
            System.out.println("January");
            break;
        }
    }
}
