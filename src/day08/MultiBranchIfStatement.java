package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //sudo code
        /*
        * given your currentSpeed , speedLimit
        * check whether the currentSpeed is
        * more than 90--->> jail
        * more than 80  and less than 90 -->> reckless driving
        *
        * -------start from here two opitonal
        * more than 70  --->> point taken
        * more than 60 and less than 70 --->> warning
        *
        * if not speeding keep driving
        *
        * */

       int currentSpeed = 45;

       if (currentSpeed>70 ){
           System.out.println( "You are speeding more than 70 .-- POINTS TAKEN !!");
           // asking whether it is less than or equal 70 and more than 60
           //
       }else if( currentSpeed>60 ) {
           System.out.println( " Your speed is less than or equal 70; but more than 60 ");

       }else {
           System.out.println(" KEEP DRIVING YOU ARE DOING GOOD!!!");
       }
    }
}
