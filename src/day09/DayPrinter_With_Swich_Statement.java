package day09;

public class DayPrinter_With_Swich_Statement {

    public static void main(String[] args) {

        int dayCode = 8;

        switch (dayCode) {
            // 1 is the actual value you are checking
            // just like dayCode ==1

            case 1 :
                System.out.println(" Day is Monday");
                break; //  use it to get out of the branch
            case 2 :
                System.out.println(" Day is Tuesday");
                break;
            case 3 :
                System.out.println(" Day is Wednesday");
                break;
            case 4 :
                System.out.println(" Day is Thursday");
                break;
            case 5 :
                System.out.println(" Day is friday");
                break;
            case 6:
                System.out.println(" Day is Saturday");
                break;
            case 7:
                System.out.println(" Day is Sunday");
                break;
            default:
                System.out.println(" Day is Unknown");


                /*
                * turn your
                * */



        }
    }
}
