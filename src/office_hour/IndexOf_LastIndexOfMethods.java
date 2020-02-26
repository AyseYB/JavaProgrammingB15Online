package office_hour;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class IndexOf_LastIndexOfMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(1);

        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));

        System.out.println("How to turn an Integer Array to ArrayList");
        Integer[] arr ={1, 2, 3, 4};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        list1.add(100);
        System.out.println(list1);

      String[] str = {"Mustafa", "Ayse"};
      ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str));
      list2.add("Zeynep");
      list2.add("Yusuf");
      list2.add("Emin");
        System.out.println(list2);
        System.out.println(list2.isEmpty());

        Integer[] arr2 = {1, 3, 4};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(list3);

        //addAll
        String[] allNames ={"Kiraz", "Muz"};
        ArrayList<String> names= new ArrayList<>(Arrays.asList("ELma","Armut","portakal"));
        names.addAll(Arrays.asList(allNames));
        System.out.println(names);

        //removeAll
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(1,1,1,1,1,2,2,2,2,2,3,3,3,4,4,4,4));
        System.out.println(numbers);

        numbers.removeAll(Arrays.asList(1));
        System.out.println(numbers);
        numbers.removeAll(Arrays.asList(2));
        System.out.println(numbers);

        //sorting the arrayList;
        //collection.sort

        Integer[] array ={1000, 900, 80, 725, 123, 542};
        ArrayList<Integer> price = new ArrayList<>();
        price.addAll(Arrays.asList(array));
        System.out.println(price);

        Collections.sort(price);
        System.out.println(price);
        Collections.reverse(price);
        System.out.println("reverse :" + price);




    }
}
