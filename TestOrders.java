import java.util.*;

public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 3.5);
        // item1.name = "mocha";
        // item1.price = 3.5;

        Item item2 = new Item("latte", 3.25);
        // item2.name = "latte";
        // item2.price = 3.25;

        Item item3 = new Item("drip coffee", 2.5);
        // item3.name = "drip coffee";
        // item3.price = 2.50;

        Item item4 = new Item("cappuccino", 3.15);
        // item4.name = "cappuccino";
        // item4.price = 3.15;



        Order order1 = new Order();

        Order order2 = new Order();

        Order order3 = new Order("Leo");

        Order order4 = new Order("Ally");

        Order order5 = new Order("Rosie");
        
        order1.addItem(item3);
        order1.addItem(item3);
        order2.addItem(item2);
        order2.addItem(item2);
        order3.addItem(item3);
        order3.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item4);


    }
}