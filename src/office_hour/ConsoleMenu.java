package office_hour;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select an option");
        int choice=scan.nextInt();
        if(choice==1){
            System.out.println("user selected 1");
        }
        if( choice==2){
            System.out.println("user selected 2");
        }
if (choice==3){
    System.out.println("user selected 3");
}


    }
}
