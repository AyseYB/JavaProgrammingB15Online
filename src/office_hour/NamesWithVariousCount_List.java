package office_hour;

import java.util.ArrayList;
import java.util.List;

public class NamesWithVariousCount_List {

    public static void main(String[] args) {

        ArrayList<String > names = new ArrayList<>();
        names.add("Mustafa");
        names.add("Ayse");
        names.add("Zeynep");
        names.add("Yusuf Ibrahim");
        names.add("Emin");
        names.add("su");
        System.out.println("names = " + names);
        lessCharCount(names);
        longerNames(names);
        reverse5CharNames(names);
       

    }
    public static void lessCharCount (ArrayList<String> names){

        for (int i = 0; i < names.size() ; i++) {
            if(names.get(i).length()<=2){
                names.remove(i);
            }
        }
        System.out.println("Without su = " + names);
    }
    public static void longerNames (ArrayList<String > names){
        String longerNames= "";
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).length() >=10 ) {
                longerNames+=names.get(i);
            }
        }
        System.out.println("longerNames = " + longerNames);
    }
    public static void reverse5CharNames (ArrayList<String >names){
        String reversedNames ="";
        for (int i = 0; i <names.size() ; i++) {
           if(names.get(i).length() == 5){
               for (int j = names.get(i).length()-1; j >=0 ; j--) {
                   reversedNames+=names.get(i).charAt(j);
               }
               names.set(i,reversedNames);
               reversedNames="";
        }

     
        }
        System.out.println("reversedNames = " + reversedNames);
    }
    



}
////Given List of names with various character count,
////Remove any name with less than 2 characters
////and if any name has more than 10 character only keep 10 characters
////and if it has exactly 5 characters , reverse it
////Of course , Otionally make a method out of it.