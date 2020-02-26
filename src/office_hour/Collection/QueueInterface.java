package office_hour.Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {

        Queue<Integer> numQue = new LinkedList<>();
        numQue.offer(1);
        numQue.offer(3);
        numQue.offer(4);
        numQue.offer(6);
        numQue.offer(8);
        numQue.addAll(Arrays.asList(4, 9, 66));

        System.out.println(  numQue );

        System.out.println(numQue.remove());
        System.out.println(numQue.poll());
        System.out.println(numQue.peek());

        System.out.println("numQue.element() = " + numQue.element());

        while ( ! numQue.isEmpty()){
            System.out.println("Done with " + numQue.poll());
        }
        System.out.println(numQue.size());


    }
}
