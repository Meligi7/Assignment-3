public class GroceryItemOrder {
    private int quantity;
    private String itemName;
    private double price;
    public GroceryItemOrder() {
    }
    public GroceryItemOrder(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}