package day12;

public class WarmUp_SeasonFinder {

    public static void main(String[] args) {

        int month =6;
        if(month>12 ||month<1){
            System.out.println("Invalid month");
        }else if( month>=3 && month<=5){
            System.out.println("SPRING!!");
        }else if(month>=6 && month<=8){
            System.out.println("SUMMER");
        }else if(month>8 && month<12){
            System.out.println("FALL");
        }else if(month==12 ||month==1 ){
            System.out.println("WINTER");
        }






    }
}
