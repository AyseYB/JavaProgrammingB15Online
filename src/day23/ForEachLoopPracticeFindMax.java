package day23;

public class ForEachLoopPracticeFindMax {

    public static void main(String[] args) {

        // I need to pick up an item from this array so I can compare with other items
        // since first one is right there , I just decided to pick it up
        // and make it temporarily the max value
        // can I pick 2nd or 3rd instead -->>> YES YOU CAN !!!

        /*
         * plain english logic to find max salary
         *
         *  write down the first number as temporarily max salary on a paper
         *  then go through each number and compare the number
         *   if the number you are comparing is more than what is on the paper
         *      delete that number and replace with bigger number
         *    keep doing this until you dont have any more number left.
         * */

        long[] salaries = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};

//
//        long maxSalary= salaries[0];
//
//        for(long salary : salaries) {
//            if (salary > maxSalary){
//                maxSalary =salary;
//            }
//        }
//        System.out.println("max salary = " + maxSalary);

        long max =salaries[0];
        for(long salary : salaries){
            // check the current salary is more than max
            if( salary>= max){
                // if so replace the existing value of max with current bigger salary
                max=salary;
               // System.out.println("max salary = " + maxSalary );
            }
        }System.out.println("max salary = " + max );





















    }
}
