package day18;

public class DoWhileAtLeastRunOnce {

    public static void main(String[] args) {

        // WHILE LOOP VS DO WHILE LOOP

        /*
         * while loop check the condition first then enter the statement
         * do while loop will take the action at least once then check the condition
         *
         * DO WHILE LOOP ALWAYS RUN AT LEAST ONE ITERATION
         * WHILE LOOP MIGHT NOT EVEN RUN !!
         * */

        int x = 1000;
        do {
            System.out.println(" Keep Going");
        }while (x<5);
        System.out.println("The End");

        System.out.println("-------------");
        while (x < 5) {
            System.out.println(" Keep Going in While");
        }
    }
}
