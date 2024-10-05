package OOPS_FULL.Inheritance;

class A {
    A() {
        System.out.println("default constructor of BaseClass");
    }

    A(int n) {
        System.out.println("paramaterized constructor of BaseClass");
    }

}

class B extends A {
    B() {
        super();
        System.out.println("Default constructor of Derived class");
    }

    B(int n) {
        this();

        System.out.println("paramaterized constructor of child class");
    }
}

public class SuperAndThisKeyword {

    public static void main(String[] args) {
        B dc = new B(5);
    }

}
