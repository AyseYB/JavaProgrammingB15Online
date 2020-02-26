package day16;

public class IndexOfWithTwoParameters {

    public static void main(String[] args) {
            //        012345678901234567890123456789012
        //String name ="I love Java I love Java Java Java";
        // get the second java from the sentence
        // assume you already know ther is 4 java in this sentence
        //second java means --->> the java showed up after first java

        //first find out where is location of the first java showed up
        //in order to find second one
        //instead of searching from beginning,
        //search from right after the location you found first java
        // then it will give give you the index of second java

        // BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        // BECAUSE INDEX OF ALWAYS START FROM BEGINNING

        // indexOf method has 2 version 1 expect 1 external data
        // another expect 2 external data -->> yourString.indexOf()

        //            012345678901234567890123456789012
        String name ="I love Java I love Java Java Java";
        System.out.println("Java starting from 0 " + name.indexOf("Java"));
        System.out.println("Java starting from 7 " + name.indexOf("Java" ,7));
        System.out.println("Java starting from 7 " + name.indexOf("Java",8));
        System.out.println("Java starting from 7 " + name.indexOf("Java",9));
        System.out.println("Java starting from 7 " + name.indexOf("Java",19));
        System.out.println("Java starting from 7 " + name.indexOf("Java", 20));

        // How do i start from the location that get past first Java
        // basically starting point different that 0 so that It get past first Java
        int firstJavaLocation=name.indexOf("Java");//location of first java in this case 7
        // starting point can be right after the index of first character of the word
        //or you can start here + 4
        // or you can start write after you finish the word you are searching , for the word java  + 4
        // if we do not know the length of the word -->> + word.length()
        int startingPointToSearchSecondJava =firstJavaLocation +1 ;
        int secondJavaLocation= name.indexOf("Java",startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        String ayse = "Ayse Yekeler Bilgic";

        System.out.println(ayse.substring(2, 4));

        int firstSpaceLocation = ayse.indexOf(" ");
        int secondSpaceLocation = ayse.indexOf(" ", firstSpaceLocation+1);
        System.out.println(ayse.substring(firstSpaceLocation+1, secondSpaceLocation));
        int thirdSpaceLocation = ayse.indexOf(ayse, secondSpaceLocation+1);
        System.out.println(thirdSpaceLocation);
        System.out.println(ayse.substring(secondSpaceLocation+1));
    }
}
