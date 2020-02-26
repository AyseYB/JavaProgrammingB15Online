package day08;

public class WarmUpTask {

    public static void main(String[] args) {

        /*
        * voting eligibility Program
        * create a variable callled age as int
        *
        * check whether this age is more than 18 or equal to 18
        * if yes print : you are ready to vote !!
        * if it's less 18 print wait until you are 18
        *
        * */

        /*
        * Create a program to guess your favorite number
        * create a variable called myFavoriteNumber as int
        * ask user to guess your favorite number
        * if user guessed right then print BINGO!
        * if not print try again later
        *
        * */

        int votingAge = 18;

        System.out.println( votingAge>= 18 );

        if( votingAge>=17 ) {

            System.out.println(" You are ready to vote !!");
        } else {
            System.out.println( " Wait you are 18 !");
        }

    }


}
