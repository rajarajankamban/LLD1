package oops.inheritance;

public class C extends B {
    public String nameC;
    C(String name, String nameB, String nameC){
        super(nameB,nameC);
        this.nameC = name;
    }
}
