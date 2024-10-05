package OOPS_FULL.Inheritance;

class Parents {

  static double dadSalary = 25000.0;
  static double momSalary = 65000.0;

  // constructor with different access modifiers

  Parents() {
    System.out.println("im the constructor of superclass");
  }

  public static void salary() {
    System.out.println("Mom salary =" + momSalary);
    System.out.println("dad salary = " + dadSalary);
  }

}

public class Son extends Parents {

  public static void main(String[] args) {

    Parents s = new Son();

    s.salary();

  }
}
