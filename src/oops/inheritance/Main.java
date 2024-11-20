package oops.inheritance;

import oops.constructor.Address;
import oops.constructor.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "TOM";
        cat.noOfLegs = 4;
//        c.color = "dsfdf";   -- Private data member can't be accessed
        cat.drink();
        cat.eat();
//        c.walk();  -- Private methods can't ve accessed


        // Constructor Chaining

        C c = new C("Rajarajan","Nil","Rajasekaran");
        System.out.println(("Class A instance "+c.nameA));
        System.out.println(("Class B instance "+c.nameB));
        System.out.println(("Class C instance "+c.nameC));


        // Remote & TV Example
        // Upcasting
        Animal animal = new Cat(); // Implicit casting
//        animal.speak(); -- speak is not present in animal reference variable
//        animal reference variable is the remote here

        // Downcasting
        Cat cat1 = (Cat)new Animal(); // Explicit casting
//        cat1.speak(); -- Will throw runtime error  [No compile time error]
    }
}