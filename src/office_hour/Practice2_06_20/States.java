package office_hour.Practice2_06_20;

public abstract class States {

    String StateName;

    public abstract void tax();

    public final void method1(){
        System.out.println("Method 1 is from States class");
    }

}

class Kentucky extends States {

    String stateName = "KY";

    @Override
    public void tax() {
        System.out.println("Tax rate in KY is %6");
    }
    public void KFC(){
        System.out.println("Ky has KFC");
    }
    public final void method1(int a){
        a = 2;
        System.out.println("Method1 is from Kentucky" + a);
    }
}

class California extends States {

    String stateName = "CA";
    @Override
    public void tax() {
        System.out.println("Tax rate in CA is %12");
    }

    public void hollywood(){
        System.out.println("There is Hollywood in CA");
    }
}
