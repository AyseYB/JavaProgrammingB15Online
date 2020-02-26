package office_hour.Collection;

import java.util.Objects;

public class Person_HashCode {

    String name;
    int age;

    public Person_HashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person_HashCode{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//
//    @Override
//    public int hashCode(){
//        return 1000;
//    }


    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public boolean equals(Object obj){
        Person p = (Person) obj;
        if(this.name.equals(p.name) && this.age == p.age){
            return true;
        }
        return false;
    }
}
