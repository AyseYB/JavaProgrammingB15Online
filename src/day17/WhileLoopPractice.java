package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // count 1 to 5 then count 5 to 1
        int counter= 1;
        while(counter<=10){
            System.out.print(counter +" ");
            ++counter;
        }
        System.out.println("counter =" + counter);
        //now i want to count 8 to 1

        while (counter>1){
            --counter;
            System.out.print(counter + " ");

        }



    }
}
