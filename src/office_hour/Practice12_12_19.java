package office_hour;

public class Practice12_12_19 {
    public static void main(String[] args) {

        int[] numbers = {1,1, 2, 2, 3, 4, 4, 5, 5};

        int count =0;
        System.out.println("+++++++++++++++" );


//        2. Write a program that can print out the unique values from  String Array
//        Ex:
//        if arr -> {"a" , "a ", "b", "c", "c"}
//        output: b
 String[] array = {"A" , "A" , "B", "C", "C"};
 int count2= 0;
 for(int i = 0; i < array.length ; i++){
     if(array[i].equals(array[i])){
         count2++;

     }
 }
if(count2==1){
    System.out.println(array[0]);
}

//        3. Write a program that can find the second max number from an int array
//        Ex:
//        if arr -> { 1,2,3,4,5}
//        output: 4
//        DO NOT use sort method
        System.out.println("=========finding max and second max number ==============");
        int[] grades={1, 2, 3, 4, 5, 6, 7, 8};
int max =grades[0];
for( int eachGrade : grades) {
    if (eachGrade > max) {
        max = eachGrade;


    }
}
        System.out.println(max);
int secondMax = grades[0];
for (int eachGrade :grades){
    if(eachGrade==max){
        continue;
    }
    if(eachGrade>secondMax){
        secondMax=eachGrade;
    }
}
        System.out.println("second max " + secondMax);


        System.out.println("=========================");

//        Swap two variable' values without using a temporary variable
//        Ex:
//        if a =10, b= 20;
//        output: print( a ) ==> 20
//        print( b ) ==> 10

        int a =10, b = 20;

        int c = a; //c =10;
         a=b; //a =20;
        b = c; //b =c
        System.out.println(a + " " + b);

        a= a+b;  // a = 30
        b= a-b; //b = 10
        a= a-b ; // a= 30-10 =20
        System.out.println(a + " " + b);


        //Assignmr



    }
}
