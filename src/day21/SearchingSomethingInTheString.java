package day21;

public class SearchingSomethingInTheString {

    public static void main(String[] args) {

        String name = "Mustafa Bilgic";
        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lastCharOfIndex = name.length() - 1;
        System.out.println("lastCharOfIndex = " + lastCharOfIndex);
        // find out index of all the letter a in cases insensetive manner
        // I will go through each and every letter of the String   '
        //                  --->> each character i can use substring(0,1) and so on
        //                  --->> going to 0 to last index  --->>> for loop

        // while i am going through each and every character
        // i will check whether current character i am looking at
        //  equals to a or A     --->>>  currentCharacter.equalsIngnoreCase("a")
        // if it is  I will print the index     println ( the variable you use to keep the index )
        //  if not  -->> just move on
        // perform this action until I reach last character   if i go over last character index i stop
        System.out.println("---1 char ---");
//        for (int x = 0; x <= lastCharOfIndex; x++) {
//          String currentChar=name.substring(x,x+1);
//          if ( currentChar.equalsIgnoreCase("a")){
//              System.out.println("the index of a or A " + x);
//            }
//        }
        int lastIndex = charCount-1;

        for(int x = 0; x <=lastIndex ; x++){
            String currentChar =name.substring(x, x+1);
            if(currentChar.equalsIgnoreCase("a")){
                System.out.println("The index of A or a" + x);
            }
        }



    }
}
