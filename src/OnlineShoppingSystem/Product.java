package OnlineShoppingSystem;

public class Product {
    private int code;
    private double price;
    private String category;
    private int quantity;

    public Product(){  
    }

    public Product(int code, double price) {
        this.code = code;
        this.price = price;
        category = "";
        quantity = 0;
    }

    public int getcode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}