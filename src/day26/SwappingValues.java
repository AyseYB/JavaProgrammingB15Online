package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";

        //name2 should have Emma, name1 should have jason
//   name1=name2;
//        name2= name1;

  String tempContainer = name1; //---->> emma
        name1=name2 ; // --->jason
        name2=tempContainer;

        System.out.println("name1" + name1);
        System.out.println("name2" + name2);

        int[] myNumbers={10, 40, 30, 7};

//        int tempfirstItem= myNumbers[0];
//        myNumbers [0] = myNumbers[3]; //
//        myNumbers[3] = tempfirstItem;
//        System.out.println("first item" + myNumbers[0]);
//        System.out.println("third item " + tempfirstItem);


        int firstTemp =myNumbers[0];
        myNumbers[0]=myNumbers[3];
        myNumbers[3]=firstTemp;
        System.out.println("first item" + myNumbers[0]);
        System.out.println("last item" + firstTemp);

        int secondTemp = myNumbers[1];
        myNumbers[1] =myNumbers[2];
        myNumbers[2] = secondTemp;
        System.out.println("second item " + myNumbers[1]);
        System.out.println("third item " +secondTemp );

        System.out.println(Arrays.toString(myNumbers));














    }
}
