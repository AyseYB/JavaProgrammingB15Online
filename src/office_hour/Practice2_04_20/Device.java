package office_hour.Practice2_04_20;

public abstract class Device implements WaterProof {

   int size;
   int price;

   public void call(){
       System.out.println("Calling with Device");
   }

   public abstract void sendMessage();

}
