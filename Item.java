public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    //setter 
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}