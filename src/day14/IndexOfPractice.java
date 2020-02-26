package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        //             012345678901
        String name = "Game of Java"; // length is 12 , last char index is 11
        // find out the location of Java
        // find out index of another string inside this String
        //
        // find out of location of java
        //find out the location of letter o
        //find out the location of first space
        System.out.println("find out of location of java");
        System.out.println(name.indexOf("Java"));

        System.out.println("find out of location of o");
        System.out.println(name.indexOf("o"));

//if the location is not found, we got minus number
        System.out.println("find out of location of uppercase O");
        System.out.println(name.indexOf("O"));

        //find out the location of first letter
        System.out.println(" find out the location of first space");
        System.out.println(name.indexOf(" "));






    }
}
