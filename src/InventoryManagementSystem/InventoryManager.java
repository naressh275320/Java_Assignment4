package InventoryManagementSystem;

import java.util.Scanner;

public class InventoryManager {
    public static void main(String[] args) {
        
        // Create an array of Products
        Product[] products = {
            new Product(101, "Bowl"),
            new Product(102, "Spoon"),
            new Product(103, "Plate"),
            new Product(201, "Cup"),
            new Product(202, "Turner"),
            new Product(203, "Bottle"),
        };

        // Create a warehouse object
        WareHouse warehouse = new WareHouse(products);
        Scanner scanner = new Scanner(System.in);
        
        // Display menu and handle user input
        while (true) {
            System.out.println("\n--- Warehouse Management System ---");
            System.out.println("1) Load new products into warehouse");
            System.out.println("2) Sell new products from warehouse");
            System.out.println("3) View available Products");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    warehouse.checkIn();
                    break;
                    
                case 2:
                    warehouse.checkOut();
                    break;

                case 3:
                    warehouse.displayAvailableProducts();
                    break;

                case 4:
                    System.out.println("Thank you for using our warehouse. Come again!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
