package model;

import java.util.ArrayList;

public class Customer {
    int customer_id;
    ArrayList<Order> order;
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }


    public Customer(int customer_id, ArrayList<Order> order, double price) {
        this.customer_id = customer_id;
        this.order = order;
        this.price = price;
    }

    public void getInvoice(double spent_money) {
        System.out.println("\n");
        System.out.println("Your Bill: " + (spent_money + this.getPrice()));
    }

}
