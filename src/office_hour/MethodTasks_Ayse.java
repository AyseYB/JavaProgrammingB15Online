package office_hour;

public class MethodTasks_Ayse {
//
//    Create below static void methods :
//    and call them in main method to test.
//    reversePrintMyOwnName
//* create a method that has no parameter
//    and print your name in reversed order

    public static void PrintMyOwnName(String myName){
        //String myName="Ayse";
      //  for(int i = 0 ; i < myName.length() ; i++){
//            if(i ==myName.length()-1 ){
//                System.out.println(myName.charAt(i));
//            }else {
          //  System.out.print(myName.charAt(i) + " - ");
//            }
//        }
             for (int i = myName.length() ; i > 0 ; i--){
             System.out.println(myName.charAt(i));
        }

    }

    public static void main(String[] args) {

        PrintMyOwnName("Ayse");

       // String myName = "Ayse";



    }
}
