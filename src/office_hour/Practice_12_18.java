package office_hour;

public class Practice_12_18 {

    public static void main(String[] args) {

        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
        //"Analiese Van der Brugge [Web Developer II] avanderbrugge6@yelp.com";
        //"Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
        // print job title from this String :  Electrical Engineer

        // logic : title is in between [ and ]  so we need to find index of [ and ]

        int startingIndex =employee.indexOf("[")+1;
       int endingIndex = employee.indexOf("]");
        String title = employee.substring(startingIndex, endingIndex);
//        System.out.println("title = " + title);
//
        String fullName = employee.substring(0,employee.indexOf(" [")  );
        System.out.println("fullName = " + fullName);
        String fullNameWithDash =fullName.replace(" ", "-");
        System.out.println("fullNameWithDash = " + fullNameWithDash);
        System.out.println(fullNameWithDash +" "+title);
//        String fullName = employee.substring(0, employee.indexOf(" ["));
//        System.out.println("fullName = " + fullName);
//        //  Philipa-Salthouse Electrical Engineer
//        String fullNameWithDash = fullName.replace(" ", "-");
//        System.out.println("fullNameWithDash = " + fullNameWithDash);
//
//        System.out.println(fullNameWithDash + " " + title);
        

















    }
}
