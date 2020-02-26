package day48;

public class Lion extends Mammals {
    @Override
    public void drinkMilk() {
        System.out.println("Lion drink milk");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lion say roarrrr !!!!");
    }

//     //   public abstract void makeNoise();
//    public abstract void drinkMilk();

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        // any class you created , it can be a data type for a variable
        // also known as reference variable
    }
}
