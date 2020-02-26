package day09;

public class DayPrinter {

    public static void main(String[] args) {

        /*
        *create a variable called dayCode as int
        * if the daycode is 1 --->>Monday
        * if the daycode is 1 --->>Tu
        * if the daycode is 1 --->>Wed
        * if the daycode is 1 --->>Thr
        * if the daycode is 1 --->>Fr
        * if the daycode is 1 --->>Saturday
        * if none of the above just print unknown day
        *

      * */
        int dayCode = 2;

        if (dayCode==1) {
            System.out.println(" Day is Monday");
        }else if(dayCode==2) {
            System.out.println(" Day is Tuesday");
        }else if(dayCode==3){
            System.out.println(" Day is Wednesday");
        }else if( dayCode==4){
            System.out.println(" Day is Thursday");
        }else if( dayCode==5){
            System.out.println(" Day is Friday");
        }else if(dayCode==6){
            System.out.println(" Day is Saturday");
        }else if(dayCode==7){
            System.out.println("Day is Sunday");
        }else {
            System.out.println(" Day is unknown ");
        }



    }
}
