package OOPS_FULL.Inheritance.class_realationships_inJAVA;

// lets take an example of many to many under the bidirectional

class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Address {
    private String state;
    private String city;
    private String zip;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}

public class ManyToMany {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Chandu");

        Employee emp2 = new Employee();
        emp2.setName("Bharath");

        Address ad1 = new Address();
        ad1.setCity("TPT");
        ad1.setState("Andhra");
        ad1.setZip("517583");

        // one to many addresses

        System.out.println(emp1.getName() + " ADDRESS " + ad1.getCity() + " " + ad1.getState() + " " + ad1.getZip());
        System.out.println(emp2.getName() + " ADDRESS " + ad1.getCity() + " " + ad1.getState() + " " + ad1.getZip());
    }

}
