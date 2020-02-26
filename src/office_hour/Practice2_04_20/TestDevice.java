package office_hour.Practice2_04_20;

import java.util.ArrayList;

public class TestDevice {

    public static void main(String[] args) {


        // Device d= new Device();

        Samsung s = new Samsung();
        s.call();
        s.color = "Pink";
        s.sendMessage();
        System.out.println("==============");
        IPhone i = new IPhone();
        i.call();
        i.sendMessage();
        //twoTimes

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> ints) {
        ArrayList<Integer> intsTwo = new ArrayList<>();
        intsTwo.addAll(ints);
        for (int i=0; i<intsTwo.size(); i+=2) {
            intsTwo.add(i, intsTwo.get(i));
        }
        return intsTwo;
    }

}
