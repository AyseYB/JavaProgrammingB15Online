package day33;

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {

        System.out.println(getDaysOfTheWeekFromNumber(1));
        System.out.println(getDaysOfTheWeekFromNumber(23));
        System.out.println(getDaysOfTheWeekFromNumber(3));
        System.out.println("======================");
        int[] allCodes ={3, 5, 7, 33, 0};
        for (int i = 0; i <allCodes.length ; i++) {
            System.out.println(getDaysOfTheWeekFromNumber(allCodes[i]));

        }
        System.out.println("====================="); // with for each loop
         for( int eachCode : allCodes){
             System.out.println(getDaysOfTheWeekFromNumber(eachCode));
         }



    }



    /**
     * getDaysOfTheWeekFromNumber
     * This method can take one number preferably (1-7)
     * and convert that to actual day in word
     *
     * @param dayCode as int  to represent day in number
     * @return the day in word in English as String if the number is valid
     * if the number is not within 1-7 return FUNDAY!
     */
    public static String getDaysOfTheWeekFromNumber(int dayCode){
      //  String dayName = "";
        switch (dayCode){
            case 1:
                return "Monday";
               // break;
            case 2:
                return "Tuesday";
                //break;
            case 3:
                return "Wednesday";
              //  break;
            case 4:
                return "Thursday";
                //break;
            case 5:
                return "Friday";
               // break;
            case 6:
                return "Saturday";
               // break;
            case 7:
                return "Sunday";
               // break;
            default:
                return "Funday";
        }
       // return dayName;
    }
    /**
            * Get Days Of The Week From Number Without Switch Statement
     * @author Seda
    // * @param daycode
     * @return
             */
//      public static String getDaysOfTheWeekFromNumber2 (int dayCode){
//        String day="";
//        String [] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//        if( dayCode>0 && dayCode<=7){
//            day=daysArray[dayCode];
//        }else{
//            day="FUNDAY!!";
//        }
//        return day;
//    }
}
