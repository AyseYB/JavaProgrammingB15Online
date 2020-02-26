package day26;

public class ArrayTask_NumberTest_logic2 {

    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 187, 87, 110};

        // LOGIC 1.2 :
        // take each item check if it is MORE than 100, increase the count.
        // in the end if count is equal to array item count the finalResult Yes, answer is NO,
        String finalResult ="";

        int cntMoreThan100 = 0;
        for( int eachNum: scores){
            if(eachNum>=100){
                ++cntMoreThan100; //increasing the counter
            }
        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);

        if (cntMoreThan100 == scores.length) {
            finalResult="Yes";
        }else {
            finalResult="NO";
        }
        System.out.println("finalResult = " + finalResult);










    }
}
