package OOPS_FULL.Inheritance.class_realationships_inJAVA;

class SuperClass {

    void show() {
        System.out.println("Im a super class");
    }
}

class SubClass extends SuperClass {
    void display() {

        System.out.println("im a child class");
    }
}

public class Inhertance_IS_A {

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.show();
        sc.display();
    }

}
