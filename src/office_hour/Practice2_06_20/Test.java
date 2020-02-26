package office_hour.Practice2_06_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Kentucky obj1 =  new Kentucky();
        obj1.KFC();
        obj1.tax();
        System.out.println("----------");
        obj1.method1();
        obj1.method1(5);
        System.out.println("----------");
        States obj2 = new Kentucky();
        obj2.tax();
        obj1.method1(2);
        System.out.println("000000000000000000");


        List<Kentucky> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Kentucky()));

      //  list.get(0);
        String name1 = list.get(0).StateName;
        System.out.println(name1);




        California obj3 = new California();
        obj3.method1();

        States obj4 = new California();

        States[] arr  = {new Kentucky(), new California()};


    }
}


interface A{

}

class B{

}