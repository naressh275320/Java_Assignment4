package OnlineShoppingSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner definition
        Scanner s = new Scanner(System.in); 

        char F = 'Y';

        System.out.print("Enter username: ");
        String customerName = s.next();
        System.out.print("Enter E-Mail ID: ");
        String emailID = s.next();

        //Customer object creation
        Customer objc = new Customer(customerName, emailID);

        Product[] products = {
                new Product(101, 450),
                new Product(102, 900),
                new Product(103, 1200),
                new Product(201, 850),
                new Product(202, 1200),
                new Product(203, 1650),
                new Product(301, 2000),
                new Product(302, 1450),
                new Product(303, 1850),
        };

        ShoppingCart objs1 = new ShoppingCart(objc, products);
        System.out.print("\nCustomer name: ");
        objs1.customer_details();

        // Do while is used because it can be run again and it will be runned one time for sure
        do{           
            System.out.println("\n--- Online shopping system ---");
            System.out.println("1) Do shopping");
            System.out.println("2) Remove products from cart");
            System.out.println("3) View Products from cart");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the category number 1)Tshirts, 2)Pants, 3)Shoes: ");
                    int n = s.nextInt();   
                    switch (n) {
                        case 1:
                            System.out.print("Enter the code number. 1)101, 2)102, 3)103: ");
                            int t = s.nextInt();
                            String category = "Tshirts";
                            objs1.addProducts(t, category);
                            break;

                        case 2:
                            System.out.print("Enter the code. 1)201, 2)202, 3)203: ");
                            t = s.nextInt();
                            category = "Pants";
                            objs1.addProducts(t, category);
                            break;

                        case 3:
                            System.out.print("Enter the code. 1)301, 2)302, 3)303: ");
                            t = s.nextInt();
                            category = "Shoes";
                            objs1.addProducts(t, category);
                            break;
            
                        default:
                            break;
                    }
                    break;

                case 2:
                    objs1.processOrder();
                    System.out.println("Do you want to remove any product from the cart?");
                    int ne = s.nextInt();
                    objs1.removeProducts(ne);
                    break;

                case 3:
                    objs1.processOrder();
                    break;
                
                case 4:
                    F = 'N';
            
                default:
                    break;
            }
        }while(F == 'Y');
        System.out.println("\nTotal price need to pay for the order: " + objs1.getTotal());
        System.out.println("\nProducts ordered: ");
        objs1.processOrder();
        objc = null;
    }
}
