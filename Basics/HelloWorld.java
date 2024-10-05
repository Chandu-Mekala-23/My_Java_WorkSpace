package Basics;

public class HelloWorld {

    static {

        System.out.println("static method");

    }

    public void hello() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        int a = 10;

        HelloWorld hw = new HelloWorld();
        hw.hello();

        System.out.println(a);
    }
}