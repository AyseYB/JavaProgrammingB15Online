package office_hour;

public class ArrayPractice_12_12_19 {

    public static void main(String[] args) {


        //  1.  Write a program that can print out the unique values from an int Array
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9};

        int count = 0;
        for (int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == 1){
                count++;
            }
        }


    }
}
