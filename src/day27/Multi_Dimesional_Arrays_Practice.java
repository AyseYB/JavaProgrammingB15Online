package day27;

import java.util.Arrays;

public class Multi_Dimesional_Arrays_Practice {

    public static void main(String[] args) {

        String[][] names={ {"Zeynep" ,"Yusuf" } ,      {"Emin" ,"Mustafa"} };
        //                    0            1               0        1
        //print emin;
        System.out.println(names[1][0]); //print emin
        System.out.println(names[1][1]);//mustafa

        names[1][0] ="Alp";
        System.out.println(names[1][0]);

        //print EMin ane Mustafa
        System.out.println(Arrays.toString(names[1]));
        //print { {"Zeynep" ,"Yusuf" } ,      {"Emin" ,"Mustafa"} };
        System.out.println(Arrays.deepToString(names));


        int[][] numbers ={{1, 2, 3}, {4, 5, 6},  {7, 8, 9} };
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(Arrays.deepToString(numbers));
        System.out.println("================================");

        //to print the array 1 2 3 4 5 6 7 8 9
        for(int i = 0 ; i < numbers.length; i++){     // checks each index of two dimensional array

            //System.out.println(Arrays.toString(numbers[i]));
            for( int j = 0; j <numbers[i].length ; j++ ){      // checks each elements of single dimensional array
              //  System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println("\n=============================="); //print entire even numbers
        // print all the even numbers from the 2D arrays
        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};

        for (int i = 0 ; i < ages.length ; i++){

            for(int j = 0 ; j < ages[i].length ; j++){
//                if(ages[i][j] %2 != 0){
//                    continue;
//                }
                if(ages[i][j] %2 == 0){
                    System.out.print(ages[i][j] + " ");
                }

            }

        }
        //System.out.println(Arrays.deepToString(ages));

        System.out.println("\n ==========For each loop============");
        int[] arr1D = { 1, 2, 3};
        for( int each :arr1D ){
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("==========For each loop with 2D array ==========");
        int[][] arr2D ={{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};
       for ( int [] each1DArray : arr2D ){   // variable name each1DArray represents each inbdex of the 2d array
            for (int eachElement : each1DArray)  // variable name eachElement represents each element that's contain in the 2d array

                System.out.print(eachElement + " ");
        }











    }
}
