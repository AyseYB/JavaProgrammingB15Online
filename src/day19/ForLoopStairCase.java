package day19;

public class ForLoopStairCase {

    public static void main(String[] args) {

//        String star ="";
//
//        for (int i = 1 ; i <= 10; i++){
//           // star = star + " * ";
//           // star += " * ";
//
//            //System.out.println( i + " " +  star );
//            System.out.println(i);
//        }

        int sumOfSquares = 0;

        for (int i = -2; i <= 2; i++)
        {
            sumOfSquares += i*i;
        }

        System.out.println(sumOfSquares);










    }
}
