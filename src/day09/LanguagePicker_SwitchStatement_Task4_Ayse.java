package day09;

public class LanguagePicker_SwitchStatement_Task4_Ayse {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center");
        System.out.println(" Please select your language option from 1- 7");
        /* assume you are on the call and you have been given option to be
        * greeted by the language of your choice according to the number you provided.
                * 1--> " hellp"
                * 2--> " salam"
                * 3 --> " hola"
                * 4 --> "Privet"
                * 5 --> Merhaba"
                * 6--> Szia"
                * 7-- > bonjour"
                * the program should set the value of a string variable called greeting
                * to this valee 1--> " hello, SDET"
                */
        int languageOption = 1;
        String greeting ="";
        switch (languageOption) {

            case 1:
                greeting = "Salam";
            case 2 :
                greeting =" hello";
            case 3 :
                greeting = " hola";
            case 4:
                greeting= " Privet";
            case 5:
                greeting = "MErhaba";
            case 6:
                greeting= "Szia";
            case 7:
                greeting= "Bonjour";






        }
    }


}
