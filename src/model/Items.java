package model;

public class Items extends Category{
    String item_name;

    public Items(String name, String category_name, String item_name) {
        super(name, category_name);
        this.item_name = item_name;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void getItemDetails () {
        System.out.println("*********** ITEMS *********** ");
        System.out.println("Main Category: " +this.getName());
        System.out.println("Category: " + this.getCategory_name());
        System.out.println("Item: " + this.getItem_name());
    }
}
