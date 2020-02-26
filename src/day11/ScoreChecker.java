package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        int scoreAssign = 49;
//        if ( scoreAssign< 0 || scoreAssign>100){
//            System.out.println("INVALID SCORE!!");
//        }else if( scoreAssign == 100 ){
//            System.out.println(" PERFECT SCORE");
////        }else if ( scoreAssign>=70 && scoreAssign<100){
//            System.out.println(" YOU HAVE PASSED!!");
////        }else{
////            System.out.println("YOU HAVE FAILED");

            if ( scoreAssign < 20){
                System.out.println(" Come to my office");
            }else if ( scoreAssign >=30 && scoreAssign<=40){
                System.out.println(" attend additional classes");
            }else if( scoreAssign >=40 && scoreAssign<= 70){
                System.out.println(" little bit more study will let you pass");
            }else {
                System.out.println(" invalid score" );
        }




    }
}
