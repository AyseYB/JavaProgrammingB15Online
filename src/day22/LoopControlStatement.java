package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
        /*
    * Store this sentence in a variable msg
    I struggle with Java I Like Java I love Java Everything is Awesome!
    loop through each and every letter
    1, print every other letter
     meaning : skip a letter each time you go through the letter
        012345678901234
        I struggle with  -->> Isrgl ih
        USE CONTINUE FOR THIS TASK
        *
    2,  when you reach letter a break the loop
    *
    *
    OPTIONALLY ; BREAK WHEN YOU SEE 3RD A in case insensitive manner
    *
    * *///           012345678901234
//        String msg = "I struggle with";
//        int countOfChar =msg.length();
//        int indexOfChar= countOfChar -1;
//        for (int x = 0; x <=indexOfChar ; x++) {
//            if( x %2 !=1)
//            System.out.print(msg.substring(x , x + 1)+ " ");
//            }
//
//        }//         01234567890123456789012345678
        String msg = "I struggle with Java ,java is fun";
        int charCount =msg.length();
        System.out.println("charCount = " + charCount);

        for (int ind = 0; ind <charCount ; ind++) {
            if (ind % 2 == 1) {
                continue;
                //  System.out.println(ind + " : " + msg.substring(ind , ind+1));

            }}
            // task 2 and 1 combined
            for (int ind = 0; ind < charCount; ind++) {
                if (ind % 2 == 1) {
                    continue;// this line will skip the rest and move to next iteration
                }
                // // this is storing each character as String
                String currentChar = msg.substring(ind, ind + 1);
                if (currentChar.equalsIgnoreCase("a")) {
                    break;// this will stop the loop
                }
                System.out.println(ind + " index " + "currentChar = " + currentChar);


                //Task 1 and 2 combined


            }}}
