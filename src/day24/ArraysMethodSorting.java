package day24;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores ={99, 44, 66, 23, 19, 55};
        System.out.println(Arrays.toString(scores));
        System.out.println("Original item value " + scores[0]);
        // for sorting an array in ascending order -- low to high
        // sort    --->>  Arrays.sort(yourArrayHere)
        Arrays.sort(scores);
        // SO WHAT HAPPEN TO MY ORIGINAL ORDER ??? GONE!!!
        // CAN I GET IT BACK ?  NO!!!!!!
        // THE ORIGINAL INDEX OF ITEMS HAS CHANGED !!
        System.out.println(Arrays.toString(scores));

        //First item value;
        System.out.println("first item value " + scores[0]);
        System.out.println("=========");

        // the low to high order for character is decided by it's ascii table value
        // special characters comes first , number , uppercase then lowercase
        char[] nameChar={'G', 'A', 'D', 'Z', 'C', 'A'};
        System.out.println("Before sorting =" +  Arrays.toString(nameChar));

      Arrays.sort(nameChar);
        System.out.println("After sorting = " +  Arrays.toString(nameChar));


        char[]nameChars ={'F' , 'g' , ' ', '9', 'A', 'c'};
        System.out.println(Arrays.toString(nameChars));

        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));
        System.out.println("=============Sorting String ====================");
        String[] superHeros ={"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println(Arrays.toString(superHeros));

        Arrays.sort(superHeros);
        System.out.println(Arrays.toString(superHeros));

        System.out.println("==============Sorting Boolean ===--SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY------============");
        boolean[] fiveSwitcOnOff ={true, false, false, true, true};
        System.out.println(Arrays.toString(fiveSwitcOnOff));

       // Arrays.sort(fiveSwitcOnOff);//Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY !!
        System.out.println(Arrays.toString(fiveSwitcOnOff));


        // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order

















    }
}
