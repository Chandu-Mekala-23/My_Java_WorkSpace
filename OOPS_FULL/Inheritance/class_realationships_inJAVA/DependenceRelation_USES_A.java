package OOPS_FULL.Inheritance.class_realationships_inJAVA;
//dependance relationship: When we create an object in of one class in another class method thwn its dependence relation.

class FirstClass {
    int a = 10;

    void show() {
        System.out.println("Im a first class method");
    }
}

class SecondClass {
    void display() {
        int b = 10;
        FirstClass fc = new FirstClass();
        // we cannot access the second class variables

        System.out.println("im second class= " + fc.a);
    }
}

public class DependenceRelation_USES_A {

    public static void main(String[] args) {

        SecondClass sc = new SecondClass();
        sc.display();

    }

}
