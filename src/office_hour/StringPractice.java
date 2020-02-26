package office_hour;

public class StringPractice {

    public static void main(String[] args) {
        //            0123456789012345678901
//        String str = "Java string is awesome";
//        int count=str.length();
//        int lastIndex =count-1;
//        System.out.println(count);
//        System.out.println(lastIndex);
//        System.out.println(str.indexOf("String"));
//        int indexOfis =str.indexOf("is");
//        System.out.println(indexOfis);
        //what if we have a more than one
//        System.out.println(str.indexOf("a"));
//        int indexOfFirstA = str.indexOf("a");
//        int indexOfSecondA = str.indexOf("a",indexOfFirstA +1);
//        System.out.println(str.indexOf("a",indexOfFirstA + 1));
//        int indexOfS=str.indexOf("s");
//        System.out.println(indexOfS);
//        int indexOfSecondS =str.indexOf("s",indexOfS+1);
//        System.out.println(indexOfSecondS);
//   int indexOfA=str.indexOf("s");
//        System.out.println(indexOfA);
//        int indexOfSecondA =str.indexOf("a",indexOfA+1);
//        int indexOfS =str.indexOf("s");
//        int indexOfSecondS =str.indexOf("s",indexOfS+1);
//        System.out.println(indexOfSecondS);
//        int indexOfThirdS=str.indexOf("s",indexOfSecondS+1);
//        System.out.println(indexOfThirdS);
//
//        String song= "ba ba black sheep , ba ";
//        int firstBa =song.indexOf("ba");
//        System.out.println(firstBa);
//        int secondBa =song.indexOf("ba",firstBa +1);
//        System.out.println(secondBa);
//        int thirdBa = song.indexOf("ba",secondBa +1);
//        System.out.println(thirdBa);
//        System.out.println(song.substring(20,22));


        String str ="my name is Ayse";

        //TASK 1
        //LOOP THROUGH EACH CHARACTER USING SUBSTRING
        //AND PRINT THEM OUT WITH IN BETWEEN

        for (int x = 0; x < str.length() ; x++) {
            String eachChar = str.substring(x, x+1);
           // System.out.println(eachChar + " -> ");
            if( x !=str.length()-1 ){
                System.out.print(eachChar + " ->");
            }else {
                System.out.print(eachChar);
            }

        }
        System.out.println("--------------");
        //Task 2
        //given 2 letter at a time compared to one from previous tasks
        //ABCDEFGH AB CD EF GH
        String string ="ABCDEFGHIjk";

        int countOfChar = string.length();
        int indexOfeachChar = string.length()-1;
        System.out.println("indexOfeachChar = " + indexOfeachChar);

        System.out.println("countOfChar = " + countOfChar);;

      for (int x =0; x<string.length(); x+=3){
          if(x !=string.length()-2){
              System.out.println(string.substring(x, x+3));
          }else{
              System.out.println(string.substring(x));
          }

//          System.out.println(string.substring(x, x+2));
      }
        System.out.println("-------------------");
      //ANOTHER TASK
        String stringa="ABCDEBC";
      //PRINT 2 LETTER AT A TIME COMPARED TO ONE FROM PREVIOUS TASKS
        //ABCDEBC -->> AB BC CD DE EB BC
        int count= 0;
        for (int x = 0; x <stringa.length()-1 ; x++){
            String twoChar = stringa.substring(x, x+2);
            System.out.println(twoChar);
            if(twoChar.equals("BC")){
                count ++;

            }
        }
        System.out.println("count is " + count);













    }
}
