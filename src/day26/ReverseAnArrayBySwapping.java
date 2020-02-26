package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {
                //                  0  1  2   3  4  5   6
        int[] myNumbers = new int[]{5, 3, 21, 2, 1, 13, 8, 4, 6, 5, 90};

        int size=myNumbers.length;
        int lastIndex =myNumbers.length-1;
        int middleIndex = size/2;

        System.out.println("BEfore swapping " +  Arrays.toString(myNumbers));

        //print out first and last
        System.out.println(myNumbers[0] + "=====" + myNumbers[lastIndex]);
        //second and one before last
        System.out.println(myNumbers[1] + "=====" + myNumbers[lastIndex-1]);
        //third and two before last
        System.out.println(myNumbers[2]+ "=====" + myNumbers[lastIndex-2]);

        for (int x = 0 ; x < middleIndex; x++){
            System.out.println(myNumbers[x] + "-------" + myNumbers[lastIndex-x]);
//            int temp =myNumbers[x];
//            myNumbers[x] =myNumbers[lastIndex-x];
//            myNumbers[lastIndex -x] =temp;

//            int firstN = myNumbers[x];
//            int lastN = myNumbers[lastIndex - x];
//            myNumbers[x] = lastN;
//            myNumbers[lastIndex - x] = firstN;
            int firstNumber = myNumbers[x];
            int lastNumber = myNumbers[lastIndex-x];
            myNumbers[x] = lastNumber;
            myNumbers[lastIndex-x]= firstNumber;


        }
        System.out.println("After swapping " + Arrays.toString(myNumbers));

















    }
}
