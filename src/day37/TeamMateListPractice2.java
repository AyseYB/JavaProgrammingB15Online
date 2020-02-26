package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice2 {

    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.99);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);

        //change the third price to $10
        priceList.set(2,10.0);
        System.out.println(" third item new price = " +  priceList.get(2));
        //add $4 to first price
        priceList.set(0, priceList.get(0)+4);
        System.out.println("first item new price = " + priceList.get(0));
        //change last price to sum of first and second price
        double sumOfFirst2Item = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1 , sumOfFirst2Item);
        System.out.println(" new price List = " + priceList);

        //give %40 off to second price
        priceList.set(1,priceList.get(1)*0.6);
        System.out.println("After 40% off second item value is = " + priceList.get(1));

        //Double the value of each and every price in the list
        //this is how do it for one ,
        System.out.println("priceList before doubling = " + priceList);
       // priceList.set(0, priceList.get(0)*2);

        for (int i = 0; i <priceList.size() ; i++) {
            double newVal = priceList.get(i)*2;
            priceList.set(i, newVal);
           // System.out.println("priceList after doubling = " + priceList);


        }
        System.out.println("priceList after doubling = " + priceList);

        //cut the price into half if the price is more than $20

        for (int i = 0; i <priceList.size() ; i++) {
            double eachPrice = priceList.get(i);
            if(eachPrice > 20){
                priceList.set(i, eachPrice / 2);
            }

        }
        System.out.println("priceList after cutting half prices more than 20 : \n\t " + priceList);
    //swap the first value with the last value
        int lastIndex = priceList.size()-1;
        double temp= priceList.get(0);
        priceList.set(0,priceList.get(lastIndex));
        priceList.set(lastIndex, temp);

        System.out.println("priceList after swapping first and last value : \n\t " + priceList);



    }
}
