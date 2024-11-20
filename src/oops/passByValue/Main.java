package oops.passByValue;



public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "B";

        swap(s1, s2);

        s1.display();


        System.out.println("Reg vs Instance 1");

        Student s3 = new Student();
        s3.age = 10;
        s3.name = "A";
        s3.display();

        Student s4 = s3;
        s4.age = 20;
        s4.name = "B";

        s4.display();

        s3.display();


}
    private static void swap(Student s1, Student s2) {
        System.out.println(s1.name);
        Student temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1.name);
    }
}
