package day31;

public class MethodPractice3 {
    // Create a class called MethodPractice4

    // no need for object when being called                : static
    // it should be accessible anywhere in your project    : public
    // it does not return any value                        : void
    // does not need any external data when being called   : (nothing inside)

    // Create a method called countDownFrom20tillOne

    public static void countDown20Till1(){
        for (int i = 20; i>=1;i--){
            System.out.print(i + " ");
        }
    }

    public static void printOddNumbers1to100(){
        for (int i = 1; i<=100; i++ ){
            if(i %2 ==1){
                System.out.print(i + " ");
            }
        }
    }
    public static void spellName(){
        String name= "Ayse";
        for (int i = 0; i < name.length();i++){
            if(i==name.length()-1){
                System.out.println(name.charAt(i));
            }else {
            System.out.print(name.charAt(i)+ " - ");
        }}

    }

    public static void main(String[] args) {
        //countDown20Till1();
        //System.out.println();
      //  printOddNumbers1to100();
        spellName();
    }

}
