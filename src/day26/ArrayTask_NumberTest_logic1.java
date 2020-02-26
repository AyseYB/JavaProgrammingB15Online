package day26;

public class ArrayTask_NumberTest_logic1 {

    public static void main(String[] args) {

        /*
         * // 1, given an int array
         *   write a program to test all the elementS in this int array are more that 100
         * */
        int[] scores ={ 156, 101, 76, 187, 87, 110 };

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

        String finalResult ="";
// if all numbers are more than 100 then make it yes , if not make it no

        // LOGIC 1 :
        // take each item check if it is less than 100, count.
        // in the end if count is more than 0, answer is NO,

        int countlessthan100 =0;
        for (int eachNum : scores){

            if(eachNum<=100){
                System.out.println("eachNum = " + eachNum);
                ++countlessthan100;
        }}
        System.out.println("count = " + countlessthan100);
        if(countlessthan100>0){
            finalResult="NO";
        }else{
            finalResult="YES";
        }
        System.out.println("finalResult = " + finalResult);













    }
}
