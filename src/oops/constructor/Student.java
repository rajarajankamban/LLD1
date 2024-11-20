package oops.constructor;

public class Student {
    String firstname;
    String lastname;
    int regId;
    int rank;
    Address address;

    public Student(String firstname, String lastname, int regId, int rank, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.regId = regId;
        this.rank = rank;
        this.address = address;
    }
}
