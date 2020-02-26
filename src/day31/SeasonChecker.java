package day31;

public class SeasonChecker {

    public static void main(String[] args) {


     // a String variable declared and assigned value inside main method
        // It can be accessible in main method
       // String mySeason ="winter";
     //   decideSeasonAction(mySeason);

        decideSeasonAction("winter");
        decideSeasonAction("Summer");


    }
    /**
     * Write a static method called decideSeasonAction
     * It has one String parameter called season
     * Inside method method :
     * according to what user passed it should print correct action
     */
    public static void decideSeasonAction(String season){
        // this season method parameter can only be accessible inside method body
        switch (season){
            case "Spring" :
                System.out.println("Hiking");
                break;
            case"Summer" :
                System.out.println("Swimming");
                break;
            case "fall" :
                System.out.println("pumpkin picking");
                break;
            case "winter" :
                System.out.println("Skiing");
                break;
            default:{
                System.out.println("Invalid value");
            }
        }



    }
}
