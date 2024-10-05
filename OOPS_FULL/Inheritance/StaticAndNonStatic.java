package OOPS_FULL.Inheritance;

class BaseClass1 {
    int a = 10; // non-static variable.
    static int b = 30;

    static void show() {
        System.out.println("static block of BaseClass");
    }

    void display() {
        System.out.println("Non static block");
    }
}

class DerivedClass1 extends BaseClass1 {
    static int a = 20;
    int b = 40;

    // This statement will generate a compile time error
    // because the instance method cannot override the static method from class A.
    static void show() {
        System.out.println("static method of DerivedClass");
    }

    // This statement will generate a compile time error
    // because the static method cannot override instance method from class A.
    void display() {
        System.out.println("non static method of derived class");
    }
}

public class StaticAndNonStatic {

    public static void main(String[] args) {
        DerivedClass1 dc = new DerivedClass1();
        System.out.println(dc.b + " " + dc.a);
        dc.show();
        dc.display();
    }

}
