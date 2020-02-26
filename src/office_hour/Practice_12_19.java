package office_hour;

import java.util.Arrays;

public class Practice_12_19 {

    public static void main(String[] args) {

        int a = 'A';
        int[] arr = {10, (byte)9, (short)8, 'a'};
        System.out.println(Arrays.toString(arr));

        int [] arr2 ={0, 0, 0};
        for (int each : arr2){
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("===================");
        for( int i = 0 ; i < 4 ; i++){
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println("===================");

        for( int i = 0 ; i < 4 ; i++) {
            if (i == 2) {
                break; // exits the loop
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println("===================");
//        1. write a program that can check if a string is build out of the same letters as another string
//		Ex: input:
//				str1 = "abc";
//				str2 = "cba";

        String str1 ="abc";
        String str2 ="cbb";
        char[] ar1= str1.toCharArray();
        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));

        char[]ar2= str2.toCharArray();
        Arrays.sort(ar2);
        System.out.println(Arrays.toString(ar2));
        System.out.println(ar1.equals(ar2));

        System.out.println("==============");
//2. Write a program that will remove all the dupplicates from a string
//				Do it withg Arrays only
        String s1 = "aaabbbbccccdddddeee"; // expected result :abcde
        String s2 ="";
        for (int i = 0 ; i < s1.length(); i++){
            String eachChar =""+ s1.charAt(i);
            if(!s2.contains(eachChar)){
                s2+=eachChar;
            }
        }
        System.out.println(s2);

        //solution 2

        String fiveMinutes = "aaabdbdgiiddoididr";
        String[] eachChar = fiveMinutes.split("");
        String result= ""; // to store all non dublicated String objects of the array
        for ( String each : eachChar){
            if(!result.contains(each)){
                result+=each;
            }
        }
        System.out.println(result);



























    }
}
