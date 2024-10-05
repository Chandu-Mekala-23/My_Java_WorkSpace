package OOPS_FULL.Inheritance;

class BaseClass {
    // Declare an instance variable and initialize value 10.
    // int a = 10;

    // Declare a constructor.
    BaseClass() {
        System.out.println("Class A constructor");
    }

    // Declare a static block.
    static {
        System.out.println("Class A SIB");
    }
    // Declare an instance block.
    {
        System.out.println("Class A IIB");
    }
}

class DerivedClass extends BaseClass {
    // int b = 20;
}

public class StaticAndConsAndInstance {

    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();

        // System.out.println("Value of a: " + obj.a);
        // System.out.println("Value of b: " + obj.b);

    }

}
