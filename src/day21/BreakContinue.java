package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <=5; x++){
            System.out.println(x);
            //this is pointless
            //after the 5th iteration
            //the loop will stop by itself
            if (x == 5) {
                break;
            }//this is pointless, because after each iteration
            //it is going to next iteration anyway!!
            continue;
        }






    }
}