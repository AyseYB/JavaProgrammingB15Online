package day12;

public class CheckingStringEquality {

    public static void main(String[] args) {

        String userName = "aBc123";
        boolean userNameCorrect =userName.equals("ABC123");

        //System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCheck= userName.equalsIgnoreCase("ABC123");

      //  System.out.println(nameCheckIgnoreCheck);

// store your name in a name variable
        // check for equality using different uppercase lowercase example
        //using equals and equalsIgnoreCase

        String name = "Ayse";
        // i want to store the result if checking name into a variable
        boolean nameEqualsWithoutCase =name.equalsIgnoreCase("ayse");
        System.out.println(" does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);
        System.out.println(name.equalsIgnoreCase("AySe"));



    }
}
