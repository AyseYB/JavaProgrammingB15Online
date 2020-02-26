package day48;

public class HR_Action {

    public static void main(String[] args) {

        //HourlyEmployee e1 = new HourlyEmployee("Subi", 101, 55, 2000);
        HourlyEmployee e1 = new HourlyEmployee("Ayse", 101,55,2000);
        System.out.println("e1 = " + e1);
        HourlyEmployee e2 = new HourlyEmployee("Zeynep",102,200,1000);
        System.out.println("e2 = " + e2);
        
        FullTimeEmployee e3 = new FullTimeEmployee("Yusuf",103,30000);
        System.out.println("e3 = " + e3);
        FullTimeEmployee e4 = new FullTimeEmployee("Emin",104,30000);
        System.out.println("e4 = " + e4);
        FullTimeEmployee e5 = new FullTimeEmployee("Mustafa", 105,30000);
        System.out.println("e5 = " + e5);
        
    }
}
