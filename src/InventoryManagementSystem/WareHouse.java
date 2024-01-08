package InventoryManagementSystem;

import java.util.Scanner;

public class WareHouse {
    private Product[] products;
    public WareHouse(Product[] products) {
        this.products = products;
    }

    // Display available products in the ware house
    public void displayAvailableProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Buy new products and increase the quantity in the ware house
    public void checkIn() {
        Scanner scanner = new Scanner(System.in);
        displayAvailableProducts();
        System.out.print("Enter product number: ");
        int productNumber = scanner.nextInt();
        
        // Find the product by its number
        Product product = findproduct(productNumber);
        if (product != null) {
            String productName = product.getproductName();
            System.out.print("Enter the number of quantity need to load for the product: ");
            int quan = scanner.nextInt();
            product.loadQuantity(quan);
            System.out.println("Product: " + productName + ". Quantity:  " + quan + " is loaded.");
        } 
        else {
            System.out.println("product " + productNumber + " does not exist.");
        }
    }

    // Sell new products and reduce the quantity in the ware house
    public void checkOut() {
        Scanner scanner = new Scanner(System.in);
        displayAvailableProducts();
        System.out.print("Enter product number: ");
        int productNumber = scanner.nextInt();
        
        // Find the product by its number
        Product product = findproduct(productNumber);
        if (product != null) {
            if (product.quantityNo()) {
                String productName = product.getproductName();
                System.out.print("Enter the number of quantity need to order for the product: ");
                int quan = scanner.nextInt();
                if(quan > product.getQuantity()){
                    System.out.println("Selling qunatity is more than the available number of quantity!");
                }
                else{
                    product.sellQuantity(quan);
                    System.out.println("Product: " + productName + ". Quantity:  " + quan + " is ordered.");
                }
            } 
            else {
                System.out.println("Product " + productNumber + " is not available.");
            }
        } 
        else {
            System.out.println("Product " + productNumber + " does not exist.");
        }
    }

    // Find a product by its number
    private Product findproduct(int productNumber) {
        for (Product product : products) {
            if (product.getproductNumber() == productNumber) {
                return product;
            }
        }
        return null;
    }
}
