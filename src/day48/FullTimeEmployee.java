package day48;

// a non-abstract sub class of abstract super class
// is called concrete class
// This class is responsible providing body (implementation)
// for all abstract methods from super class.
public class FullTimeEmployee extends Employee{

//public FullTimeEmployee(){
//
//}
    double monthlySalary;

    public FullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Fulltime Employee yearly : " + monthlySalary * 12);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id + ", yearly : " + monthlySalary *12 +
                '}';
    }
}
