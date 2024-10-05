package OOPS_FULL.Inheritance.class_realationships_inJAVA;

// when we create an object of one class in another class then its said to be Association
// association has Aggregation and Composition types

class Neighbour {
    public void show() {
        System.out.println("hello this is neighbour class");
    }
}

class NeighbourWife {
    Neighbour ng = new Neighbour();

    void display() {
        System.out.println("im ur neighbours wife");
    }
}

public class Association_HAS_A {

    public static void main(String[] args) {
        NeighbourWife nw = new NeighbourWife();
        nw.display();
        // important
        nw.ng.show();
    }

}
