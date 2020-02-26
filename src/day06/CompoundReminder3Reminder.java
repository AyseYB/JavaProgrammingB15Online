package day06;

public class CompoundReminder3Reminder {

    public static void main(String[] args) {

        int bankBalance = 1140;
        System.out.println( " i have spent the half of it " + bankBalance);

        bankBalance /= 2;
        System.out.println( " now my bank account is " + bankBalance);

        bankBalance %=500 ;   //570 divided by 500 and the reminder is 70
        System.out.println( " I want to divide the balance by 500 and keep the reminder in my pocket");
        System.out.println( " The reminder is : " + bankBalance) ;











    }
}
