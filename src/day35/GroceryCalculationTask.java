package day35;

public class GroceryCalculationTask {
    public static void main(String[] args) {

        String sentence ="I bought 3 tomatoes and the price was 3,14 each";
        // How much is your final checkout price
// The count is always 3rd word
// The price is always at 2nd word from the last

//        String[] allWords = sentence.split(" ");
//        int count =Integer.parseInt( allWords[2]);
//        String priceString=allWords[allWords.length-2];
//        double price = Double.parseDouble(priceString);
//
//        System.out.println("Total price is " + (count*price));

        String[] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords[2]);

        // getting the last element of any array we use index length-1
        // getting the second last element of any array we use index length-2
        String priceString = allWords[allWords.length-2];
        priceString=priceString.replace(",",".");

       // double price =Double.parseDouble(allWords[allWords.length-2]);
        double price =Double.parseDouble(priceString);
        System.out.println(count*price + "total price");




    }
}
