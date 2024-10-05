package Strings;

public class ToStringMethod {

    int rollno;
    String studentName;
    String city;

    ToStringMethod(int rollno, String studentName, String city) {
        this.rollno = rollno;
        this.studentName = studentName;
        this.city = city;
    }

    @Override
    public String toString() {
        return rollno + " " + studentName + " " + city;
    }

    public static void main(String[] args) {

        ToStringMethod tsm = new ToStringMethod(11, "chandu", "Hyderabad");
        ToStringMethod tsm1 = new ToStringMethod(111, "Sandhya", "Banglore");

        System.out.println(tsm);
        System.out.println(tsm1);

    }

}
