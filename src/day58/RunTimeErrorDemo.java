package day58;

public class RunTimeErrorDemo {

    static int num = 0;

    public static void main(String[] args) {

        num++;
        System.out.println("num " + num);
        //create main method again
        main(null);
    }



}
