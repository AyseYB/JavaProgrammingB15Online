package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        // at the McDonald's drive thru

        String order="";
        int itemNumber= 55;
        //what data type of variable i can use here
        //byte, short, int, char, String
        switch (itemNumber){
            case 11 :
                System.out.println(" You have selected 11");
                order="Burger";
                break;
            case 5:
                System.out.println(" You have selected 5");
                order= "French Fries";
                break;
            case 8:
                System.out.println(" You have selected 8");
                order= " Nuggets";
                break;
            case 35:
                System.out.println(" You have selected 35");
                System.out.println(" YAY ,, YUM YUM !!");
                System.out.println(" ENJOY !!");
                order= " Ice Cream";
                break;
            default:
                System.out.println(" YOu have selected Unknown item number");
                order=" Unknown";
                break;
        }
        System.out.println(" Your order is " + order);








    }



}
