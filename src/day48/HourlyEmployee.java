package day48;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numOfHours;


//    public void HourlyEmployee(){
//
//    }

    public HourlyEmployee(String name, int id, double hourlyWage, int numOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numOfHours = numOfHours;
    }

    public HourlyEmployee(double hourlyWage, int numOfHours) {
        this.hourlyWage = hourlyWage;
        this.numOfHours = numOfHours;
    }

    @Override
    public void calculateAnnualSalary (){
        System.out.println("Hourly Employee yearly : " +(hourlyWage * numOfHours)  );
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numOfHours=" + numOfHours +
                ", name='" + name + '\'' +
                ", id=" + id + ", yearly salary = " + (hourlyWage * numOfHours) +
                '}';
    }
}
