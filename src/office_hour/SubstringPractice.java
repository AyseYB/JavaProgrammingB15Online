package office_hour;

public class SubstringPractice {

    public static void main(String[] args) {

        String movie= "Lord of the Ring";
        String wordOf=movie.substring(5,7);
        System.out.println("wordOf =" + wordOf);

        String wordThe=movie.substring(8,11);
        System.out.println("word the = "+ wordThe);

        String secondWordToLast = movie.substring(5,16);
        System.out.println(" second word till last " + secondWordToLast);

        String secondToLast =movie.substring(5);
        System.out.println(secondToLast);

        String wordRing=movie.substring(12);
        String wordOfThe=movie.substring(4,12);
        String wordLord=movie.substring(0,4);
        System.out.println(wordLord + wordOfThe + wordRing);
        System.out.println(wordRing + wordOfThe + wordLord);
        System.out.println(wordRing + wordOfThe + "Java "+ wordLord);
    }
}
