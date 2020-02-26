package office_hour.Collection;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        List<Double> lst = new LinkedList<>(Arrays.asList(3d, 4d, 27d, 66d, 3d, 3d, 44d));
        List<String> stringList = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e"));
        System.out.println(lst);
      //  System.out.println(stringList);

        //accesing items using index
        System.out.println("lst.get(0) = " + lst.get(0));
       // System.out.println("stringList.get(3) = " + stringList.get(3));

        //adding items in certain index
        lst.add(1,5d);
        System.out.println(lst);
        stringList.add(3,"@@@");
        //System.out.println(stringList);

        //updating item in certain index
        lst.set(0, 99.0);
        System.out.println(lst);
        stringList.set(0,  "A");
        //System.out.println(stringList);

        // getting index of certain items
        System.out.println("lst.indexOf(4.0) = " + lst.indexOf(4.0 ));
        //System.out.println("stringList.indexOf(0) = " + stringList.indexOf(0));


        System.out.println(lst.lastIndexOf(3.0));
        System.out.println(lst.lastIndexOf(100.0));
        stringList.lastIndexOf(2);

        //remove(object)
        // remove (index)
        lst.remove(1);
        System.out.println(lst);
        stringList.remove("@@@");
        //System.out.println("stringList with removing @ = " + stringList);

        //addAll at certain index
        lst.addAll(2,Arrays.asList(99d, 89d));
        System.out.println(lst);
        stringList.addAll(4, Arrays.asList("x","y", "z"));

        //replaceAll(Function)
        System.out.println("replace each item with new value increased by 5 : "  );
        lst.replaceAll(each -> each+5);
        System.out.println(lst);
        System.out.println("replace each item with new value with each next to them: "  );
       // stringList.replaceAll(each -> each + each);


        //sort
       // lst.sort(null); //natural order
        //lst.sort(Comparator.naturalOrder());
        lst.sort(Comparator.reverseOrder());
        System.out.println(lst);
        stringList.sort(Comparator.reverseOrder());
        //System.out.println("stringList with reverse order = " + stringList);

        //getting view out of list object
        //view is part of your original list oobject
        // sublist (from, to);
        System.out.println("lst.subList(2,4) (Index view from 2 to 4 ) = " + lst.subList(2, 4));
        List<Double> partOfView = lst.subList(2, 4);
        System.out.println(partOfView);
        System.out.println(lst);

        System.out.println("====================================================");
        // list Iterator
        ListIterator<Double> lstIter = lst.listIterator();

        System.out.println("lstIter.hasNext() : " + lstIter.hasNext());
        System.out.println("lstIter.nextIndex() : " + lstIter.nextIndex());

        while(lstIter.hasNext()){

            System.out.print("lstIter.nextIndex() = " + lstIter.nextIndex());
            Double item = lstIter.next();
            System.out.println("Item is " + item);

            if(item < 10){
                lstIter.remove();
            }
        }
        System.out.println(lst);
        System.out.println("lstIter.hasNext() = " + lstIter.hasNext());
        System.out.println("lstIter.hasPrevious() = " + lstIter.hasPrevious());
        System.out.println("lstIter.previousIndex() = " + lstIter.previousIndex());
     //   System.out.println(lstIter.previous());
     //   System.out.println(lstIter.previous());

        while (lstIter.hasPrevious()){
            System.out.print("lstIter.previousIndex() = " + lstIter.previousIndex());
            Double item = lstIter.previous();
            System.out.println("| item is " + item);
            if(item < 60){
              //  lstIter.remove();
                lstIter.set(200D);
                lstIter.add(1000D);
            }
            System.out.println(lst);
        }


    }
}
