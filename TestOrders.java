import java.util.*;

public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.25;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.50;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 3.15;



        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.total += item1.price;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total += item4.price;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;



        order1.ready = true;
        order2.ready = true;


    }
}