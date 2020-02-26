package day24;

import java.util.Arrays;

public class ArrayTasks {

    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] storePrice = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

//        Do below tasks :
//• 1, loop through each grocery items and print them in one line
//        1.1 print each items at odd index
//        1.2 print all items in reverse order
//        1.3 find out the index location of strawberry
//        1.4 find out the count of groceries that contains berry in the name
//        1.5 print out all the character counts of the grocery items
//        1.6 print out only those items with even character count
//        1.7 print out only those items end with letter e
//        1.8 print out only last 3 characters of all the items
//        1.9 create String variable called allItems and store all the items inside array separated by comma.
        System.out.println(Arrays.toString(groceryItems));

        for (String fruit : groceryItems) {
            System.out.println(fruit);
        }

        for (float eachPrice : storePrice) {
            System.out.println(eachPrice);
        }
        System.out.println(Arrays.toString(storePrice));

        System.out.println("===========Reversing the prices======");
        for (int i = storePrice.length - 1; i >= 0; i--) {
            System.out.println(storePrice[i]);
        }

        System.out.println(" ==========fruit in reverse order======");

        for (int f = groceryItems.length - 1; f >= 0; f--) {
            //     System.out.print(groceryItems[f] + " ");
        }
        System.out.println();
        System.out.println("==========finding Strawberry=======");


        int index = 0;
        for (int i = 0; i <= groceryItems.length - 1; i++) {
            if (groceryItems[i].contains("strawberry")) {
                index = i;
                System.out.println("strawberry's index = " + index);
            }
        }
        System.out.println("=========How many Berry ============");
        int countOfBerry = 0;
        for (int i = 0; i <= groceryItems.length - 1; i++) {
            if (groceryItems[i].contains("berry")) {
                ++countOfBerry;
            }
            System.out.print(countOfBerry + " "); // shows the berry one by one
        }
        System.out.println(countOfBerry); // shows directly the count

//        1.5 print out all the character counts of the grocery items

        for (int i = 0; i <= groceryItems.length - 1; i++) {
            System.out.println(groceryItems[i] + " has " + groceryItems[i].length() + " character ");
        }
        System.out.println("============Even character counts =======");
//        1.6 print out only those items with even character count
        int itemCounts = groceryItems.length;
        for (int i = 0; i <= groceryItems.length - 1; i++) {

            if (groceryItems[i].length() % 2 == 0) {
                System.out.println(groceryItems[i]);
            }
        }
//        1.7 print out only those items end with letter e
        System.out.println("======= fruits contains e letter ==========");
        String endsWithE = "";
        for (int i = 0; i <= groceryItems.length - 1; i++) {
            if (groceryItems[i].charAt(groceryItems.length - 1) == 0) {
            }

        }









    }
}
