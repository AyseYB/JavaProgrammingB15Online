package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {

    public static void main(String[] args) {

//Warm up:
//Create Arraylist of String and store
//teamMates
//print one by one
//print reverse
//print first last
//print 2 at a time
//concat everyone in one string separated by -
       // ArrayList<String > teamMates = new ArrayList<>();
        List<String > teamMates = new ArrayList<>();
        teamMates.add("Ayse");
        teamMates.add("Mustafa");
        teamMates.add("Zeynep");
        teamMates.add("Yusuf");
        teamMates.add("Ibrahim");
        teamMates.add("Emin");

        System.out.println("teamMates = " + teamMates);

        //first item and last item
        System.out.println("teamMates.get(0) = " + teamMates.get(0));

        int lastItemIndex = teamMates.size()-1;

        System.out.println("last item = " + teamMates.get(lastItemIndex));

        //print one by one

        for (int i = 0; i < teamMates.size() ; i++) {

            System.out.println("item = " + teamMates.get(i));

        }

        System.out.println("\n All Items in reverse order");
        for (int x = lastItemIndex ; x >= 0 ; x--){
            System.out.println("item  " + (x+1) + " = " + teamMates.get(x ));
        }
        //pritn 2 items at a time
        //for example ; 1-2, 2-3, 3-4
        System.out.println("\n print 2 items at a time");
        for (int x = 0; x <= teamMates.size()-2; x++) {
            System.out.println("\t"+ teamMates.get(x) +"----" + teamMates.get(x+1));
        }
        //pritn 2 items at a time
        //for example ; 1-2, 3-4, 5-6
        System.out.println("\n print 2 items at a time without repeating");

        for (int x = 0; x <= teamMates.size()-2 ; x+=2) {
            System.out.println("\t"+ teamMates.get(x) +"----" + teamMates.get(x+1));

        }

        //concat everyone in one string separated by -
        
        String result= "";
        for (int i = 0; i <teamMates.size() ; i++) {
            result =result + teamMates.get(i) ;
            if(i !=teamMates.size()-1){
            result+="-";
           }
        }
        System.out.println("result = " + result);
        
        //TODO
        String lstToString = teamMates.toString();
        System.out.println("lstToString.replace(\",\" ,\" -\") = " + lstToString.replace(",", " -")
                                                                                .replace("[","")
                                                                                 .replace("]",""));






    }
}
