package office_hour;

public class Repl_126 {

    public static void main(String[] args) {

        String str ="olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] myArray = str.split(",");

        int shortestWord=myArray[0].length(); //shortest size is 3

        String[] shortArray =new String[2];

        for (String splittedWord : myArray){
            if(splittedWord.length()<shortestWord){
                shortestWord=splittedWord.length();
            }
        }

        for(int i = 0 ; i < myArray.length; i++){
            if(myArray[i].length() ==shortestWord){
                String collectionOfWords;

            }
        }

    }
}
