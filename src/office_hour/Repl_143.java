package office_hour;

import java.util.Arrays;

public class Repl_143 {
//    Two-dimensional Arrays - 2D array has a type such as int[][] or String[][],
//    with two pairs of square brackets.
//    The elements of a 2D array are arranged in rows and columns,
//    and the new operator for 2D arrays specifies both the number of rows and the number of columns.
//    You have  2D array multiplicationTable declared with 10 rows and 10 columns.
//    Write java program to populate the array with multiplication table values like in the picture below:

    public static void main(String[] args) {
        int [][] multiplicationTable = new int[10][10];

        //TODO: type your code below
//        for (int i = 0 ; i <multiplicationTable.length ; i++){
//            for (int j = 0 ; j < multiplicationTable.length ; j++){
//                multiplicationTable[i][j]= (i+1) * (j+1) ;
//            }
//        }

     for(int i  = 0; i < multiplicationTable.length ; i++){
         for(int j = 0 ; j < multiplicationTable.length ; j++){
             multiplicationTable[i][j]=(i + 1) * (j + 1);
         }
     }


        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }
}

