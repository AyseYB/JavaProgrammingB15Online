package day24;

public class ShoppingWithArray {
    public static void main(String[] args) {
         /*
    * Create a String array of 6 items to store groceryItems
    {"apple","banana","grape","strawberry","blueberry","kiwi"}
    Create a float array of 6 float values to store prices
    { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
    assume that the order of grocery Items match the prices in same order.
    * */
         //String [] groceryItems=new String[6];
        // String[] groceryItem =new String[]{"apple","banana","grape","strawberry","blueberry","kiwi"};
         String[] groceryItem ={"apple","banana","grape","strawberry","blueberry","kiwi"};
        // print everything in one line with arrow
         for(String eachFruit:groceryItem){

           //  System.out.print(eachFruit + " ->>");
             System.out.print(eachFruit);
             System.out.print(" -->");
         }
        // print everything in one line with arrow  and do not put arrow after last one
        // assume you know last item is kiwi
        // if the fruit you are checking is kiwi , just dont't add it
        // How to get last item of any array programatically ??    arr[arr.length-1]
        System.out.println();
        int itemCount =groceryItem.length;
         int lastItemIndex = itemCount-1;
         String lastFruit =groceryItem[lastItemIndex]; // groceryItem[groceryItem.length-1]

     for( String eachFruit : groceryItem){
         System.out.print(eachFruit );
         if(! eachFruit.equals(lastFruit)){
             System.out.print("--->");
         }
         //for each loop is mostly for read

     }



        System.out.println();
















    }
}
