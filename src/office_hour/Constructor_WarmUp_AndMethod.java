package office_hour;

import java.util.ArrayList;

public class Constructor_WarmUp_AndMethod {

    //Write a return method that can remove duplicates from a string
    //Ex; RemoveDup("abcabc") ==> returns "abc"

    public static void main(String[] args) {
      //System.out.println(removeDup("ABCABCDEFDEF"));

        String a = removeDup("ABCDEFABCDEF");
        System.out.println(a);

        int count = count("Ayse , Mustafa, Ayse , Mustafa, Ayse", "Ayse");
        System.out.println(count);


        String howMany =frequency("ABBB");
        System.out.println(howMany);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(-100);
        int maxNum = maxNum(list);
        System.out.println(maxNum);

        int minNum = minimum(list);
        System.out.println(minNum);





    }

  public static String removeDup(String str){
      String result = "";
      for (int i = 0; i <str.length() ; i++) {
          if(!result.contains(str.substring(i, i+1))){
              result += str.substring(i, i+1);
          }

      }
      return result;
  }

    /**
     * task2
     * write a method that accepts two parameter String a and b, and returns
     * the total numbers of apperence of b in String a
     * ex = count ("abcaba") ===> returns 3
     */

   public static int count(String firstList, String second){
       int count =0;
       for (int i = 0; i < firstList.length() ; i++) {
           if(firstList.contains(second)){
               count++;
               firstList = firstList.replaceFirst(second, "");
           }

       }
       return count;
   }

    /**
     * task 3
     * use the above two methods to write a new method that can find the freguency
     * ex ; frequency ("aabcabcabc") ==>a4b3c3
     */

    public static String frequency(String str) {

        String nonDup = removeDup(str);
        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
        int frequency = count(str, str.substring(i, i+1));
        result += nonDup.substring(i, i+1) + frequency;
        }
        return result;
    }

    /**
     * task 04
     * write a method that can find the maximum number from an Integer arraylist
     */

    public static int maxNum (ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for ( int each : list){
            if (each > max){
                max= each;
            }
        }
        return max;
    }

    /**
     * task 5
     * write a method that can find the minimum number from an integer arraylist
     */
    public static int minimum (ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for ( int each: list){
            if( min > each){
                min = each;
            }
        }
        return min;
    }

}
