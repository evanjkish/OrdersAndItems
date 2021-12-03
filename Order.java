import java.util.*;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
        this.items = items;
    }

    public Order(String name) {
        this.name = name;
        this.items= items;
    }

    //getters
    public String getName(){
        return this.name;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public boolean getReady(){
        return ready;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }

    //methods
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.ready = true){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        
        double total = 0;
        
        for (Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }
    
    public void display(){
        System.out.println("Name: " + this.name);
        for(Item i: this.items){
            System.out.println(i.getName() + " -$" + i.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }
}