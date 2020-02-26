package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTasks {

    //    Create a method called isNumberOnly and it accept a String object and
//    return true if all of its characters are number.
    public static boolean isNumberOnly ( String lst){
        for (int i = 0; i <lst.length() ; i++) {
            if(!Character.isDigit(lst.charAt(i))){
                return false;
            }
        }
        return true;
    }
    //    Create another method isNumberList , it accepts List<String> object and
//    return true only if all items are number only (use above method)
    public static boolean isNumberList (List<String > str){
        for (String each:str){
            if(!isNumberOnly(each)){
                return false;
            }
        }

      return true;
    }

    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>(Arrays.asList("Esra","12345","12h345"));
        System.out.println(isNumberList(lst));

    }
}


//    Create another method isNumberList , it accepts List<String> object and
//    return true only if all items are number only (use above method)