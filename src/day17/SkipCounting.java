package day17;

public class SkipCounting {

    public static void main(String[] args) {

        //Skip counting by 3 from 0 till 30
        //3 6 9 ...30

        int counter = 0;
        while(counter< 30){
           // counter =counter + 3;
            counter +=3;
          //  System.out.println(counter + " ");
        }
        //write a program to print our a even number from 0 to 50
        //write a program to print out a odd number from 0 to 50;

        int cntE =0;
        while( cntE <= 50){
            System.out.print( cntE + " ");
            cntE +=2;
        }
        System.out.println(" ------------------");
        int cntO =1;
        while(cntO <= 50){
            System.out.println(cntO + " ");
            cntO +=2;
        }

        System.out.println("_______-");
        int cnt3 = 0;
        while(cnt3<=50) {
            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even number");
            } else {
                System.out.println(cnt3 + " is odd number");
            }
            ++cnt3;


        }
    }
}
