package office_hour;

public class Practice_12_09 {

    public static void main(String[] args) {

        int[] nums= new int[3];
        nums[0] =5;
        nums[1] =16;
        nums[2] =25;

for(int x = 0 ;x <= nums.length-1; x++) {
    System.out.println(nums[x]);

}
        System.out.println(nums.length);
for (int y = nums.length-1 ; y>=0 ; y--){
    System.out.println(nums[y]);
}
int lastItem =nums.length-1;
        System.out.println(nums[lastItem]);

        int middleItem= nums.length/2;
        System.out.println(nums[middleItem]);



       int max =nums[0];
       int sum=0;

        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > max) {
                max = nums[x];
               sum=sum+nums[x];
            }
        }

        System.out.println("Max value is " + max);

        System.out.println(sum);



    }
}
