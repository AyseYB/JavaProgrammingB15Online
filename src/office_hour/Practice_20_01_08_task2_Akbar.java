package office_hour;

import java.util.ArrayList;
import java.util.List;

public class Practice_20_01_08_task2_Akbar {

    public static void main(String[] args) {
        System.out.println(nameCharList("Ayse"));
        List<Character> resultList = nameCharList("Ayse");
        resultList.add('m');
        System.out.println("resultList = " + resultList);
    }

    /**
     * a method that accept String object and turn it into List<Character>
     *
     * @param name
     * @return List<Character> that contains each character.
     */
    public static List<Character> nameCharList(String name){

        List<Character> charLst = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            charLst.add(name.charAt(i));
        }
        return charLst;
    }
    /**
     *
     * Create a method that accept String object
     *
     * and return List<Character> that contains each character.
     *
     */
}
