package day55;

import day54.interface_as_reference.Clothes;

public class Calculator {

    int result;

    public Calculator minusNUm(int num){
        this.result -=num;
        return this;
    }

    public void displayFinalResult(){
        System.out.println("Final result " + result);
    }





    public Calculator addNum(int num){
        this.result +=num;
        return this;
    }

//    public static void main(String[] args) {
//
//        Calculator c1 = new Calculator();
//        c1.addNum(100);
//        c1.minusNUm(50);
//        System.out.println(c1.result);
//
//       //c1.addNum(100);
//        c1.addNum(100).addNum(200).addNum(100).minusNUm(200);
////        c1.addNum(100);
////        c1.addNum(200);
//        //
//       System.out.println("c1.result = " + c1.result);


  //  }
}
