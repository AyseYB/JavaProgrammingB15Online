package OOP.OfficeHour.parent;

import office_hour.PatientInfo;

public class Family {

    public static void main(String[] args) {

        Parent p1 = new Parent("Mustafa", 38, 1234);
        //p1.age = 34;
        System.out.println(p1.age);
        p1.cookFood("Chicken Soup");

        Parent p3 = new Parent("Ayse", 33, 1245);
        p3.cookFood("rice");

        Child c1 = new Child("ZB", 11, 12345);
        c1.cookFood("rice");



    }
}
