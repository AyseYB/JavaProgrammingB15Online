package office_hour;

import java.util.Arrays;

public class GroceryItems {

    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
//• 1, loop through each grocery items and print them in one line
        System.out.println(Arrays.toString(groceryItems));
        for (String fruits : groceryItems) {
            System.out.print(fruits + " ");
        }
        System.out.println();
        // 1.1 print each items at odd index
        for (int i = 0; i < groceryItems.length; i = i + 2) {
            System.out.print(groceryItems[i] + " ");
        }

        System.out.println();
        for (int i = groceryItems.length - 1; i >= 0; i--) {
            System.out.print(groceryItems[i] + " ");
        }

        System.out.println();
       // 1.3 find out the index location of strawberry
        int index= 0;
        for(int i = 0 ; i<groceryItems.length ; i++){
            if( groceryItems[i].contains("strawberry")){
               index=i;
                System.out.println("Strawberyy is at index " + index);
            }
        }
        System.out.println();


       // 1.4 find out the count of groceries that contains berry in the name

        int berry=0;
        for (int x = 0; x<groceryItems.length ; x++){
            if(groceryItems[x].contains("berry"))
                berry++;
          //  System.out.println("count of berry " +  berry);
        }
        System.out.println("count of berry is " +  berry);

        System.out.println();
       // 1.5 print out all the character counts of the grocery item
//        int charCount=0;
//        for (int x = 0; x < groceryItems.length ; x++){
//            charCount=groceryItems[x].length()-1;
//            System.out.println(charCount);
//        }
        int charCount = 0;
        for (int i = 0; i < groceryItems.length; i++) {
            charCount = groceryItems[i].length() ;
            System.out.println(groceryItems[i] + "  " + charCount);
        }
        System.out.println("==========finding even char grocery item==============");
        //1.6 print out only those items with even character count

        for(int i = 0; i < groceryItems.length  ; i++){
            if(groceryItems[i].length() %2 ==0){
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("=========finding items ends with letter e  ");
       // 1.7 print out only those items end with letter e

        for (int i = 0; i < groceryItems.length ; i++){
            if(groceryItems[i].endsWith("e")){
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("=========Printing only last 3 char of all item =========");
       // 1.8 print out only last 3 characters of all the items
        for (int i = 0 ; i < groceryItems.length ; i++){
            System.out.println(groceryItems[i].substring(groceryItems[i].length()-3));
        }
        for(int i = 0; i < groceryItems.length ; i++){

        }
        System.out.println();
       // 1.9 create String variable called allItems and store all the items inside array separated

//String allItems =






































    }
}
