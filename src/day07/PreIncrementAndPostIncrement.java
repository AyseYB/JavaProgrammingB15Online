package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        //increment a
       // int apple = 8;

      //  apple++ ; // incrementing by one --->> 9
       // System.out.println( apple );
       // System.out.println( ++apple);
       // System.out.println( apple++); //when ++ comes after the variable it is called post increment
        // but it will reflect the increased the value next time the variable show up !!
       // System.out.println( apple);

        int score = 50;
        System.out.println(++score);

        System.out.println(score++ ); // 51 and ready to be 52 next time it shows up
        System.out.println( score);
        System.out.println( --score);
        System.out.println( score--);// still 51  and ready to be 50 next time it shows up
        System.out.println( score);









    }
}
