package office_hour;

public class Method_ReverseString {
    public static void main(String[] args) {
        String word = "ayse";
        reverseString(word);
        System.out.println(word);
    }


    public static String reverseString(String str){
        String reversedString="";
        for(int i = str.length()-1 ; i >= 0 ; i--){
            reversedString +=str.charAt(i);
        }
        return reversedString;
    }

    //I HAVENT DONE WITH THAT YET

}
