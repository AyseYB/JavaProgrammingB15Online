package day23;

import java.util.Arrays;

public class StringArrayPractice {
    public static void main(String[] args) {

        // we created array in short way just by opening up { }
        // we put them in different line since white space does not matter
//        String [] show = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super girl"};
//
//        int showsCount = show.length; // count of the show
//        System.out.println("shows Count = " + showsCount);
//
//        for (int x = 0; x < showsCount ; x++) {
//           // String currentShow= show[x];
//            //System.out.println( currentShow + " has character count : " + currentShow.length() );
//            System.out.println(show[x] + " has character count : " + show[x].length());
//        }
        
        String[] names = {"Mustafa" , "Ayse", "Zeynep", "Yusuf", "Emin"};
        for (int i = 0; i < names.length ; i++) {
            //System.out.println("names[i] = " + names[i]);
            //String currentname =names[i];
            //System.out.println(currentname + " has char count " + currentname.length());
            System.out.println(names[i] + " has char count " + names[i].length());

//            System.out.println(names[i] + " has char count " + names[i].length());

        }
       // System.out.println(Arrays.toString(names));



















    }}
