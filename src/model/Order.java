package model;

import java.util.ArrayList;

public class Order {
    String customer_name;
    ArrayList<Items> items;

    public Order(String customer_name, ArrayList<Items> items) {
        this.customer_name = customer_name;
        this.items = items;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}
