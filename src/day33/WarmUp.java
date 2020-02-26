package day33;

public class WarmUp {

    public static void main(String[] args) {
       // String SpelledName= getSpelledName("");
//        System.out.println("SpelledName = " + getSpelledName("Ayse"));
//        System.out.println("Spelled Name = " + getSpelledName("Zeynep"));
//        System.out.println(getSpelledName("Mustafa"));
//        System.out.println(getSpelledName("Yusuf"));
//        System.out.println(getSpelledName("Emin"));
        System.out.println(getSpelledName2("Emin"));
        System.out.println(getSpelledName2("emin"));


    }
    /**
     * getSpelledName2
     * This method will put dash in between given String
     * for example : Akbar -->> A-k-b-a-r
     *
     * @param name this is the name parameter
     * @return the name has dash in between
     */

//    public static String  getSpelledName2(String name){
//        String result ="";
//        // Keep adding dash until right before last character
//        // then concatenate last character
//        for (int i = 0; i < name.length()-1; i++) {
//            // this loop will add dash after each character
//            // until 2nd character from the last
//           result += name.charAt(i) + "-";
//        }
//
//        // result has everything but last character
//        // so now we need to add last character back to the result
//        return result + name.charAt(name.length()-1) ; // this is last character !!!!
//    }
public static String getSpelledName2(String name){
    String result = "";
    for (int i = 0; i <name.length()-1 ; i++) {
        result +=name.charAt(i)+ "*";

    }

    return result + name.charAt(name.length()-1);
}




    /**
     * getSpelledName
     * This method will put dash in between given String
     * for example : Akbar -->> A-k-b-a-r
     *
     * @param name this is the name parameter
     * @return the name has dash in between
     */
    public static String getSpelledName(String name){

        String result = "";

        for (int x = 0; x <name.length() ; x++) {

           result = result+name.charAt(x);
//
            if(x != name.length()-1){
             result = result+ "-";
            }
        }
        return result;
    }
}
