package day29;

public class HeroIdentity {
    public static void main(String[] args) {
        // Assume this can be different hero
        String hero1 = "Supermar -Clark J Kent" ;
        //hide this heri identity
        // String heroX

        //given a String with hero code and name seperated by -
        // turn this String into hero code and * with same length as hero name

        //Plain English LOgic
        //split it by - to ger the code and fullname
        // get the length of the full name
        //generat stars with same length as full name character count
        //concatenate herocode with dash (-)and save it.

        // OR once the stars is generated , replace full name with stars
        String[] heroSplitted = hero1.split("-");
        String heroCOde= heroSplitted[0];
        String fullName= heroSplitted[1];

        int nameCharCount = fullName.length();
        String stars = "";
        for (int i = 0 ; i < nameCharCount; i++){
            stars=stars + "*"; // stars += "*"
        }
        System.out.println(fullName);
        System.out.println(stars);

        String heroX = heroCOde+ " - " + stars;
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);






    }
}
