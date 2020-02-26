package day22;

public class LoopingArrayThroughArrayInReverseOrder {

    public static void main(String[] args) {

        int[] scores=new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int elementCOunt=scores.length;
        int lastIndex =elementCOunt-1;

        // we are printing in reverse order so
        // so we start with highest index till lowest index 0  -->> 3-0

        for (int x =lastIndex ; x >= 0 ; x--) {
            System.out.print("index location " + x + " : ");
            System.out.println(scores[x]);

        }















    }
}
