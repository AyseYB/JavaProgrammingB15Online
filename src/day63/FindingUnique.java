package day63;

import javax.naming.NamingEnumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindingUnique {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // How many unique character showed up in above sentence

        //ONE WAY TO DO IT
        //first create a HashSet object with type Character
        //iterate over each character in above String
        // then add it to the HashSet so it can remove the duplicate for us

        Set<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            charSet.add(str.charAt(i));
        }
        System.out.println("how many character over all ?  " + str.length()  );
        System.out.println("How many unique character ? " + charSet.size());
        System.out.println("charSet = " + charSet);

        for ( Character eachChar : charSet){
            System.out.println("each unique Char = " + eachChar);
        }
    }
}
