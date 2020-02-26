package office_hour;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

//        using an if statement check which int is larger a or b, and then output:
//        "number is greater".
//       for example:
//        a=1
//        b=2
//        output:
//        2 is greater
//        a=5
//        b=7
//        output:
//        7 is greater

//if(a>b){
//    System.out.println(a+" is greater");
//} if(b>a){
//    System.out.println(b+" is greater");
//}
        Scanner scan =new Scanner(System.in);
        System.out.println(" enter two numbers");
int a= scan.nextInt();
int b=scan.nextInt();
        if (a > b) {
            System.out.println(a+ " is greater");
        }else if(b>a){
            System.out.println(b+ " is greater");
        }

    }
}
