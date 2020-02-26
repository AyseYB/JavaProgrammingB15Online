package office_hour;

public class WarmUpAaaBbbCcc_ABC {
    public static void main(String[] args) {
        
        String str ="aaabbbccc";
        String uniqueStr ="";

        for (int i = 0; i <str.length() ; i++) {
            
            String eachChar =str.substring(i,i+1);
            if( !uniqueStr.contains(eachChar)) {
                uniqueStr += eachChar;
                System.out.println(eachChar);
            }
            System.out.println("Each char " + eachChar);
        }
        System.out.println("uniqueStr = " + uniqueStr);


        
        
        
        
        
        
        
        
        
        
        
    }
}
