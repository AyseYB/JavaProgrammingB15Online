package day33;

public class MethodWithReturnPractice2_2 {

    public static void main(String[] args) {

        System.out.println(getDaysOfTheWeekFromNumber(1));
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

    public static String getDaysOfTheWeekFromNumber(int dayCode) {
        String day = "";
        String[] days = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        if (dayCode > 0 && dayCode <= 7) {
            day = days[dayCode];
        } else {
            day = "Funday!";
           // return day;
        }
return day;
    }

}

















































































































