package src.services;
import src.models.Customer;
import src.models.Product;

public class Order {
    public void orderService (Customer customer, Product product){
        System.out.println(customer.getName() + " sifaris etdi " + product.getTitle() + " azn " + product.getPrice());
        System.out.println(" Sifaris tamamlandi!");
    }

}
