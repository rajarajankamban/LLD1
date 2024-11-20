package oops.constructor;

public class Address {
    String line1;
    String line2;
    String locality;
    String city;
    short pincode;



    public Address(String line2, String line1, String locality, String city, short pincode) {
        this.line2 = line2;
        this.line1 = line1;
        this.locality = locality;
        this.city = city;
        this.pincode = pincode;
    }

    public Address(Address address) {
        this.line2 = address.line2;
        this.line1 = address.line1;
        this.locality = address.locality;
        this.city = address.city;
        this.pincode = address.pincode;
    }
}
