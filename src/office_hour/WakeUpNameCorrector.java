package office_hour;

public class WakeUpNameCorrector {

    public static void main(String[] args) {

        String name = "emiNAlp";
String nameFixed = name.charAt(0)+"".toUpperCase();
nameFixed += name.substring(1,4).toLowerCase();
nameFixed +=name.charAt(4)+"".toUpperCase();
nameFixed +=name.substring(5).toLowerCase();
        System.out.println(nameFixed);













    }
}
