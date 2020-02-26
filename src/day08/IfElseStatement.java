package day08;

public class IfElseStatement {

    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 45;
        // if the current speed is more than speed limit
        // get pulled over by the police
        // given the ticket by the police
        // taking away some points on your license
        // go to court

         boolean IamSpeeding  = (yourCurrentSpeed > speedLimit );
         //INSIDE THE PARANTHESIS WE CAN ONLY PUT
        // BOOLEAN VALUE
        // BOOLEAN VARIABLE ; true , false
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE
         //if ( IamSpeeding) {
        //if ( true) {
        if(yourCurrentSpeed > speedLimit) {
             System.out.println( "  get pulled over by the police");
             System.out.println( "given the ticket by the police ");
             System.out.println( "taking away some points on your license ");
             System.out.println( "go to court ");
         } else {
             System.out.println( " go shopping !");
             System.out.println( " Enjoy your day !!");
         }
        System.out.println( " THE END !!");


         }

         // if not over the
        // go shopping !!

        // outside if statement, say the end

}
