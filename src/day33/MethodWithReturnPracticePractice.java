package day33;

public class MethodWithReturnPracticePractice {

    public static void main(String[] args) {
        System.out.println(build_GOT_Email("Yusuf", "Bilgic"));

        String fullName="Yusuf Bilgic";
        String part1=fullName.split(" ")[0];
        String part2=fullName.split(" ")[1];
        String hisEmail = build_GOT_Email(part1, part2);
        System.out.println("hisEmail = " + hisEmail);


    }


    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com
     * @param firstName user's first name
     * @param lastName  user's last name
     * @return the email created using
     * firstName initial + lastName + @NightWatch.com
     */
    public static String build_GOT_Email(String firstName , String lastName ){
        String email = firstName.charAt(0)+ lastName+  "@NightWatch.com" ;
        return email;
    }
}
