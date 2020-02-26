package office_hour.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 9,7, 5, 10 ));

        System.out.println(coll);

        Iterator<Integer> myIter = coll.iterator();

       // hasNext() method
     System.out.println(myIter.hasNext());

//        //next();
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//
//        // remove();
//        myIter.remove();

        while (myIter.hasNext() ){
            Integer each = myIter.next();
            System.out.print(each + " - ");
            if(each > 5){
                myIter.remove();
            }


        }

        System.out.println();
        System.out.println(coll);
        System.out.println("myIter = " + myIter);


    }
}
