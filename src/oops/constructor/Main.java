package oops.constructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Parametrized consturctor
        Address address = new Address("534","random street","Ramapuram", "Chennai",(short) 600293);

        // Copy constructor
        Student s = new Student("rajarajan","rajasekaran",(short) 2323,(short) 323, address);
        System.out.println("name "+s.firstname);



        System.out.println("address "+s.address.line1);
    }
}