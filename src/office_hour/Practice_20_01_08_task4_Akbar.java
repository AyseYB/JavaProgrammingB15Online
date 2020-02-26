package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_20_01_08_task4_Akbar {

    public static void main(String[] args) {
        System.out.println(character("Ayse"));


    }

    public static List<String > character(String str){

        List<String> character = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            character.add(str.substring(i, i+1));

        }
        return character;
    }
}
   // Create a method that accept String object and return List<Character> that contains each character.
