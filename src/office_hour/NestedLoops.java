package office_hour;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

        int[][] myComplexArray = {{5, 2, 1, 3} , {3,9,8,9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray){
            for (int i = 0; i < mySimpleArray.length ; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();

        }

        System.out.println("++++++++++++++++++++++++");
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2 + " the answer" );

        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb + " Bir bakalim donmus mu?");
        System.out.println("=================");

        String x = "abc";
        String y = "abc";
        System.out.println(x==y);

        String x1 = new String("ABC");
        String y1 = new String("ABC");
        System.out.println(x1.equals(y1));

        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias) + " bugs and alies same?") ;
        System.out.println(alias.toString());


    }
}
