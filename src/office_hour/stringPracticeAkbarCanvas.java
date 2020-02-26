package office_hour;

import java.util.Scanner;

public class stringPracticeAkbarCanvas {


    public static void main(String[] args) {

        String str = "A";
        if(str.length() >2){
            System.out.println(str.substring(0,2));
        }else if(str.isEmpty()){
            System.out.println("empty String");
        }else {
            System.out.println(str.charAt(0) + "" + str.charAt(0));
        }

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter name");
//        String name = scan.nextLine();
//       // String intials = name.charAt(0) +"" + name.charAt(4);
//        int lastNameInitial = name.indexOf(" ") + 1;
//        String intials = name.charAt(0) +""+ name.charAt(lastNameInitial);
//        System.out.println(intials);
//===================================================================================

//        System.out.println("Enter a word at least 3 character ");
//        String name = scan.nextLine();
//        int lastChar = name.length()-1;
//        int middleIndex = (name.length()-1)/2;
//        System.out.println("first char = " + name.charAt(0));
//        System.out.println("last char = " + name.charAt(lastChar));
//        System.out.println("Middle char = " + name.charAt(middleIndex));

//        System.out.println("Enter a name with prefix");
//        String name = scan.nextLine();
//
//        if(name.startsWith("Dr ")){
//            System.out.println("Doctor");
//        }else if(name.startsWith("Mr ")){
//            System.out.println("Male");
//        }else if(name.startsWith("Miss ")){
//            System.out.println("Single female");
//        }else if(name.startsWith("Mrs ")){
//            System.out.println("Married female");
//        }else {
//            System.out.println("Invalid prefix");
//        }

        //System.out.println("Enter full Name ");
//        String fullName = scan.nextLine();
//        int spaceIndex = fullName.indexOf(" ");
//        String email = fullName.charAt(0) + fullName.substring(spaceIndex + 1);
//        System.out.println(email+"@NightWatch.com");

//        System.out.println("Enter a valid email address");
//        String email = scan.next();
//        int indexOfAtSign = email.indexOf("@");
//        int indexOfDot = email.indexOf(".");
//
//        String part1 = email.substring(0,indexOfAtSign);
//        System.out.println("part1 = " + part1);
//
//        String part2 = email.substring(indexOfAtSign+1 ,indexOfDot );
//        System.out.println("part2 = " + part2);
//
//        String part3 = email.substring(indexOfDot+1);
//        System.out.println("part3 = " + part3);

        //===============================================

//        System.out.println("enter sentence");
//        String sentence = scan.nextLine().trim();
//
//        int firstIndexOfSpace = sentence.indexOf(" ");
//        System.out.println("firstIndexOfSpace = " + firstIndexOfSpace);
//        int lastIndexOfSpace = sentence.lastIndexOf(" ");
//        System.out.println("lastIndexOfSpace = " + lastIndexOfSpace);
//        if(firstIndexOfSpace == lastIndexOfSpace){
//            System.out.println("There is only two words");
//        }else{
//            System.out.println("There is more than two words");
//        }

        //=================================================

//        System.out.println("Enter a valid url ");
//        String url = scan.next();
//
//        int firstDotIndex =url.indexOf(".");
//        System.out.println("firstDotIndex = " + firstDotIndex);
//        int lastDptIndext = url.lastIndexOf(".");
//        System.out.println("lastDptIndext = " + lastDptIndext);
//
//        System.out.println(url.substring(firstDotIndex + 1,lastDptIndext));

        //===================================================

//        System.out.println("Enter a sentence with 3 words"); // and print out the second word
//        String sentence = scan.nextLine();
//
//        int indexOfFirstSpace = sentence.indexOf(" ");
//        int indexOfSecondSpace = sentence.lastIndexOf(" ");
//        System.out.println(sentence.substring(indexOfFirstSpace+1, indexOfSecondSpace));
//======================================================================================
//        System.out.println("Enter a sentence with 3 words");  first and last word
//        String sentence = scan.nextLine();
//
//        String firstWord, lastWord;
//        int indexOfFirstSpace = sentence.indexOf(" ");
//        int indexOfSecondSpace = sentence.lastIndexOf(" ");
//        System.out.println(sentence.substring(0,indexOfFirstSpace) + sentence.substring(indexOfSecondSpace));

        //===============================================================================

        //swap first and last charachter

        System.out.println("Enter a word with at least 2 character");
        String word = scan.next();

        if(word.length() == 2){
            System.out.println(word.charAt(word.length()-1) + "" + word.charAt(0));
        }else if(word.length() > 2){
            System.out.println(word.charAt(word.length()-1 ) + word.substring(1, word.length() -1) + word.charAt(0));
        }


















    }
}
