package day40;

import java.util.ArrayList;

public class HotMarketActions_toString {

    public static void main(String[] args) {


        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;

        Offer o4 = new Offer();

        ArrayList<Offer> myOffer = new ArrayList<>();
        myOffer.add(o1);
        myOffer.add(o2);
        myOffer.add(o3);
        myOffer.add(o4);

        System.out.println("myOffer = " + myOffer);
    }
}
