package InventoryManagementSystem;

public class Product {
    private int productNumber;
    private String productName;
    private int quantity;

    public Product(int productNumber, String productName) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.quantity = 0;
    }

    public int getproductNumber() {
        return productNumber;
    }

    public String getproductName() {
        return productName;
    }

    public boolean quantityNo() {
        if(quantity != 0){
            return true;
        }
        return false;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public void loadQuantity(int quantity){
        this.quantity += quantity;
    }

    public void sellQuantity(int quantity){
        this.quantity -= quantity;
    }
    
    @Override
    public String toString() {
        return "Product Number " + productNumber + ": " +  " Product Name " + productName + "         : " + " Quantity " + quantity;
    }
}
