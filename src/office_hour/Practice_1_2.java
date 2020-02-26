package office_hour;

public class Practice_1_2 {
    public static void main(String[] args) {
       String str = "AABBCCDDEE";
       String result1 ="";  //strore non duplicated values;ABCD
        for (int i = 0; i <str.length()  ; i++) {

            if(!result1.contains(str.substring(i, i+1))) {
                result1 += str.substring(i, i + 1);
            }

//            if(!result1.contains("" + str.charAt(i))){   //char at method
//                result1 +=""+ str.charAt(i);
//
//            }
        }
        System.out.println(result1);

        System.out.println(RemoveDup("AABBCCNNKKDD"));

        System.out.println(frequency("DDHRDKDH", 'D'));
        frequencyOfChars("AABBCC");





    }



//    1.  write a return method called RemoveDup that accepts a String and
//    removes duplicate values from the String
//Ex:
//	RemoveDuplicate("aaabbbccc") ==> "abc"
    public static String RemoveDup(String str){

        String result1 ="";  //strore non duplicated values;ABCD
        for (int i = 0; i <str.length()  ; i++) {

            if(!result1.contains(str.substring(i, i+1))) {
                result1 += str.substring(i, i + 1);
            }

        }
        return result1;


    }



//    2. write a return method called Frequency that accepts String and  char,
//    the method will return the total number of ocuurence of the given char in the given string
//    Ex:
//    Frequency("AAABBB", 'A') ==> 3

    public static int frequency (String str, char ch){
        int count =0;
       char[] arr = str.toCharArray();  // this is char array method
       for( char each: arr){
           if (each ==ch){
               count++;
           }
       }
//        for (int i = 0; i <str.length() ; i++) {
//            if( i == ch){
//                count++;
//            }
//        }
        return count;
    }

    //    the frequency of each characters
//    from the given String
//Ex:
//	FrequencyOfChars("CCAAABBBCCCC")  ==> A3B3C3

    public static void frequencyOfChars(String str){

        String nonDup = RemoveDup(str); //ABC
        for (int i = 0; i < nonDup.length() ; i++){
            int count = frequency(str, nonDup.charAt(i));
            System.out.println(""+ nonDup.charAt(i)+ count);

        }


    }




    }
//    3. Combined the methods 1 & 2 to write a method that prints
//    the frequency of each characters
//    from the given String
//Ex:
//	FrequencyOfChars("CCAAABBBCCCC")  ==> A3B3C3




