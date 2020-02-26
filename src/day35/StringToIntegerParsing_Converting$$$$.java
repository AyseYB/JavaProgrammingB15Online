package day35;

import day14.StringReview;

public class StringToIntegerParsing_Converting$$$$ {


    public static void main(String[] args) {

        String strNum ="100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String empID = "FB-457";
        int id =Integer.parseInt(empID.split("-")[1]); // this is the one shot
        System.out.println("id = " + id);

//        String[]empIDSplit =empID.split("-");       
//        System.out.println("id = " + id);
//        String idStr = empIDSplit[1];
//        int id = Integer.parseInt(idStr);
//        System.out.println("id = " + id);



        // i have a string called twoNumber
        String twoNumber ="100, 600";
//        String num1="100";
//        String num2= "600";
//        int num1a=Integer.parseInt(num1);
//        int num2b=Integer.parseInt(num2);
//        System.out.println(num1a + num2b);

        String[] twoNumberSplit = twoNumber.split(", ");
        String firstNum =twoNumberSplit[0];
        String secoNum =twoNumberSplit[1];
        int firstNumA = Integer.parseInt(firstNum);
        int secoNumA = Integer.parseInt(secoNum);
        System.out.println(firstNumA+secoNumA + "-");
    String num1 = "100";
    String num2 = "200";
//
//    int num1a=Integer.parseInt(num1);
//    int num2a=Integer.parseInt(num2);
//        System.out.println(num1a+num2a);
        int numA= Integer.parseInt(num1);
       int numB= Integer.parseInt(num2);
        System.out.println(numA+numB);


    }
}
