package day17;

public class SkipCounting2 {

    public static void main(String[] args) {

        int counter = 0;

        while( counter<=50){

            if( counter %2 == 0){
                System.out.println(counter + " is even number");
            }else{
                System.out.println(counter + " is odd number");
            }
            ++counter;
        }




    }
}
