package Strings;

public class ConstructorEx {

    int num;
    String name;

    ConstructorEx(int num, String name) {
        this.num = num;
        this.name = name;

    }

    @Override
    public String toString() {
        return num + " " + name;
    }

    private static void main(String[] args) {

        ConstructorEx ce = new ConstructorEx(011, "Chandu");

        System.out.println(ce);

    }

}
