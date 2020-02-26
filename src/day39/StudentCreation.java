package day39;

public class StudentCreation {

    public static void main(String[] args) {

        // how do we create an object out of template
        Student s1 = new Student();
        // set the values for s1 object attribute
        s1.name = "Yusuf";
        s1.age = 7;
        s1.gender ='M';
        // get the values for s1 object attribute
        System.out.println(s1.name + ", " + s1.age +", " + s1.gender);

        Student s2 = new Student();
        s2.name = "Emin";
        s2.age = 3;
        s2.gender = 'M';
        int oldAge = s2.age;


        System.out.println(s2.name + ", " + s2.age +", " + s2.gender);

        s2.age = 5;
        System.out.println("emin's new name" + s2.age);

        System.out.println("the difference between old and new age = " + (s2.age -oldAge));

    }

/*
*
Variable types :
according to what kind of data it store :
	primitive variable -->> pure value
	reference variable -->>
					the pointer to the object in the heap
					the address of the obejct in the heap
					remote of the TV
					leash of the dog
according to the location it shows up :
	 inside method : --> local variable
	 inside ( ) of method header -->>
	 				method parameter
	 outside method inside class
	 		--> Field
	 			instance field or instance variable
	 			static filed (will learn later)
* */
}
