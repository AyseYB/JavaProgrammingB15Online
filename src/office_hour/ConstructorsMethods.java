package office_hour;

public class ConstructorsMethods {

    //Constructor is a very special method, used for creating the object of the class
    /**
     * every single class must have a constructor, if we didn't give the constructor, then the compiler
     * will give the default(no-arg)constructor
     * decleration of constructor:
     * default constructor (constructor without arg)
     * access-modifier className(){
     *     statement
     * }
     * access-modifier className(parameter)
     *
     *constructor cannot have return type and specifier
     * constructor's nme must be same with the class name
     *
     * contstructor calls only a constructor can call another constructor
     * constructor execution depends on the creation of the objects
     */
    public ConstructorsMethods(){
        System.out.println();

    }

    public static void main(String[] args) {
        ConstructorsMethods obj = new ConstructorsMethods();
    }
}
