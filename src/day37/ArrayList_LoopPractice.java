package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {

    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");
        System.out.println("nameLst = " + nameLst);

        //find longest name

        String longestName = nameLst.get(0); // assume the first one the longest one
        for (int x = 0; x < nameLst.size(); x++) {

            String currentName = nameLst.get(x);
            //> will give you first longest name if you have more than one
            //>= will give you second longest name if you have more than one
           if(currentName.length() >= longestName.length()  ){
               longestName= currentName;
           }
        }
      //  System.out.println("longestName = " + longestName);

        for (int i = 0; i <nameLst.size() ; i++) {
            if(nameLst.get(i).length() == longestName.length()){
                System.out.println("Longest names = " + nameLst.get(i));
            }

        }

        // length     :  counting the elements inside array , it's a property of array object
        //last item of an array : arr[arr.length-1]
// length()   :  counting the characters inside String , it's a method of String object
        //last char of a String :str.charAt(str.length()-1)
// size()     :  counting the elements inside ArrayList object
        // last element of an arrayList : lst.get(lst.size()-1)


        // HOW DO WE USE FOR EACH LOOP TO GO THROUGH EACH ITEMS

        System.out.println("========================");

        for (String currentName:nameLst) {
            System.out.println("currentName = " + currentName);

        }




    }
}
