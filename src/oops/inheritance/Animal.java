package oops.inheritance;

public class Animal {
    public int noOfLegs;
    public String name;
    private String color;

    public void drink(){
        System.out.println(this.name+ " is drinking");
    }

    public void eat(){
        System.out.println(this.name + " is eating");
    }

    private void walk(){
        System.out.println(this.name + " is walking");
    }
}
