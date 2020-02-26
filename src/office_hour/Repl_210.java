package office_hour;

public class Repl_210 {

    public static String reverseLetters(String word){
        //TODO
        String reversed="";
        String result="";

        for(int i=word.length()-1; i>=0; i--){
            if(Character.isLetter(word.charAt(i))){
                reversed+=word.charAt(i);
            }
        }

        int x=0;
        for (int i = 0; i <word.length() ; i++) {
            if(!Character.isLetterOrDigit(word.charAt(i))){
                result+=word.charAt(i);
            }else if(Character.isLetter(word.charAt(i))){
                result+=reversed.charAt(x);
                x++;
            }
        }


            return word;
    }

//    Reverse a string without affecting special characters
//Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
//
//
//Input:   str = "a,b$c"
//Output:  str = "c,b$a"
//Note that $ and , are not moved anywhere.
//Only subsequence "abc" is reversed.
//
//Input:   str = "Ab,c,de!$"
//Output:  str = "ed,c,bA!$"
//
//Input:   str = "----qwe--r--tyf...gd.---"
//Output:  str = "----dgf--y--tre...wq.---"
}
