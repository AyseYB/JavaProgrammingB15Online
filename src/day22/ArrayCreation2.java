package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {
        
        //creating an array in second way
         int [] ages =new int[]{ 3, 5, 11, 33, 57, 18};
         
         int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);
     //   System.out.println("ages = " + ages);

        // to see all the ages inside the arrey we go to loop
        for (int x = 0; x < itemCount; x++) {
            System.out.print(ages[x] + " ");
        }

        System.out.println();
        // if you do it this way : IT MUST HAPPEN IN ONE LINE TOGETHER
        int [] areaCodes ={ 312 , 300, 703 ,665};

        for (int x = 0; x < areaCodes.length; x++) {
            System.out.print(areaCodes[x] + " ");

        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
