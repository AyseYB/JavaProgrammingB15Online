package day21;

public class NameBreaker {
    public static void main(String[] args) {

        String name = "ayse";

      for(int x = 0; x< name.length();x++){
          char currentChar =name.charAt(x);
          if(currentChar == 'e' || currentChar =='E'){
              break;
          }
          System.out.println(currentChar);
      }



    }
}