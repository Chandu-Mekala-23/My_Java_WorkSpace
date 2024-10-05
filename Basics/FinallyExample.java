package Basics;

public class FinallyExample {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static int testMethod() {
        try {
            // Return statement encountered
            return 1;
        } finally {
            // This will be executed before the method returns
            System.out.println("Finally block executed.");
        }
    }
}