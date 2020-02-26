package office_hour;

public class SwitchStatement_Ayse {

    public static void main(String[] args) {

        int restaurantRating = 6;
        switch (restaurantRating){
            case 1:
                System.out.println(" THis restaurant is not favorite");
                break;
            case 2:
                System.out.println(" this restaurant is good");
                break;
            case 3:
                System.out.println(" this restaurant is fantastic");
                break;
            default:
                System.out.println(" I've never dined at this restaurant");
                break;

        }
        int num =3;
        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }

        char gradeRating ='B';
        switch (gradeRating){
            case 'A':
            System.out.println(" Excellent!! ");
            break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Middle");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("Fail");
                break;
        }

    }
}
