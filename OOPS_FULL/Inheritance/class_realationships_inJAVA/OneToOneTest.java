package OOPS_FULL.Inheritance.class_realationships_inJAVA;

//one to One realtion : A person can have only one passport under bidirectional.

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Passport {
    private int passportNo;

    public int getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(int passportNo) {
        this.passportNo = passportNo;
    }
}

public class OneToOneTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Chandu");

        Person p2 = new Person();
        p2.setName("Sandhya");

        Passport pp1 = new Passport();
        pp1.setPassportNo(11623);

        Passport pp2 = new Passport();
        pp2.setPassportNo(23116);

        System.out.println(p1.getName() + " " + pp1.getPassportNo());
        System.out.println(p2.getName() + " " + pp2.getPassportNo());

    }

}
