package OnlineShoppingSystem;
import java.util.*;

public class ShoppingCart {
    private Product[] products;
    private Customer customer;

    Scanner s = new Scanner(System.in);

    public ShoppingCart(Customer customer, Product[] products) {
        this.customer = customer;
        this.products = products;
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            if(product.getQuantity() != 0){
                total += product.getPrice();
            }
        }
        return total;
    }

    public void customer_details(){
        System.out.println(customer.getName());
    }

    public void processOrder() {
        for (Product product : products) {
            if(product.getQuantity() != 0){
                System.out.println(product.getcode() + " " + product.getPrice() + " " + product.getCategory());
            }
        }
    }

    private Product findProduct(int productid){
        for(Product product : products){
            if( product.getcode() == productid){
                return product;
            }
        }
        return null;
    }

    public void addProducts(int code, String category){
        System.out.println("Enter the quantity: ");
        int quan = s.nextInt();

        Product product = findProduct(code);
        if(product != null){
            product.setCategory(category);
            product.setQuantity(quan);
        }
        else{
            System.out.println("Invalid option");
        }
    }

    public void removeProducts(int code){
        Product product = findProduct(code);
        if(product != null){
            product.setQuantity(0);
        }
    }
}
