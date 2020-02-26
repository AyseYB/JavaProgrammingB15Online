package day27;

import java.util.Arrays;

public class Multi_Dimensional_Array {

    public static void main(String[] args) {

            /*
        Single dimensional array: contains vaules
                int[] arr = {1, 2, 3};
        Multi-dimensional array: an Array that can contain array(s)
                            N dimesional Array MUST contains (N-1) demesional arrays
                    ex: 2 dimesional array: conatins 1 dimesional arrays
                            int[][] arr2D = { {1,2,3 } , {4, 5, 6 }   }
     */
            int[]arr1D= {1, 2, 3};
            //arr1D[1] --->>2
        System.out.println(Arrays.toString(arr1D));

        // 2D array: is an array that contains single dimensional arrays
        //                0  1  2       0   1   2
        int[][] arr2D={ { 1, 2, 3},  { 4, 5, 6  }};
        //index            0              1


        //arr2D[0] ==>>{1, 2, 3 }
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0])); //returns Array value
        System.out.println(Arrays.toString(arr2D[1]));

        //arr2D[0][2] ===>>3
        System.out.println(arr2D[0][2]);//return int value thats why we dont use Arrays.toString

        //print 5: arr2D[1][1]
        System.out.println(arr2D[1][1]);

        //Array.deepString(multi_D array)
        System.out.println(Arrays.deepToString(arr2D));


















    }
}
