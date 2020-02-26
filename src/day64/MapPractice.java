package day64;
import java.util.*;
public class MapPractice {

    public static void main(String[] args) {

        //what if we want to have multiple value for oen key??
        //for example groupCode --group member names
        //String   List<String>
        //key data type is String, value data type is List<String>
        Map<String , List<String>> groupMap = new HashMap<>();
        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

        //System.out.println("groupMap = " + groupMap);


        groupMap.forEach( (groupCode,allMembers) -> System.out.println("groupCode = " + groupCode +"\n\t members : "+ allMembers ) );
//get Toyly , he is at index 3
        System.out.println("groupMap.get(\"Achievers\").get(3) = " + groupMap.get("Achievers").get(3));
        //check whether this map has Gulzina or not in BugHunter?

        System.out.println("groupMap.get(\"BugHunter\").contains(\"Gulzina\") = " + groupMap.get("BugHunter").contains("Gulzina"));


    }
}
