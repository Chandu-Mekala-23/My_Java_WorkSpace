package OOPS_FULL.Encapsulation;

public class Mobile {

    private String name;
    private String color;
    private int ram;
    private int price;

    public Mobile(String name, String color, int ram, int price) {
        this.name = name;
        this.color = color;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile[name=" + name + ",color=" + color + ",ram=" + ram + ",price=" + price + "]";
    }

}
