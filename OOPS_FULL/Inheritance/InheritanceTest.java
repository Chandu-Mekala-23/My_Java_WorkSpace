package OOPS_FULL.Inheritance;

class BaseClass {
    public void ownFeatures() {
        System.out.println("superclass features");
    }
}

class DerivedClass extends BaseClass {
    public void extraFeatures() {
        System.out.println("derived class features");
    }
}

public class InheritanceTest {

    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        dc.extraFeatures();
        dc.ownFeatures();
    }

}
