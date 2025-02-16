package src;
import src.models.Book;
import src.models.Customer;
import src.services.Order;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 35 );
        Book book2= new Book (" OOP principles", 29);
        Book book3 =new Book("Data Structures", 46);

        System.out.println("Online kitab magazamiza xos gelmisiz!");
        System.out.println("Elde olan kitabkarimiz:");
        System.out.println("1. " + book1.getTitle() + " " +book1.getPrice() + " -azn");
        System.out.println("2. " + book2.getTitle() + " "+ book2.getPrice() + " -azn");
        System.out.println("3. " + book3.getTitle() + " "+ book3.getPrice()+ " -azn");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi daxil edin: ");
        String name = scanner.nextLine();
        Customer customer = new Customer(name);

        System.out.println("kitabinizi secin (1-3)");
        int choice = scanner.nextInt();
        if (choice < 1 || choice >3) {
            System.out.println(" error bas verdi!");
            return;

        }

        Order order = new Order();
        switch(choice) {
            case 1:
                order.orderService(customer, book1);
                break;
            case 2:
                order.orderService(customer, book2);
                break;
            case 3:
                order.orderService(customer, book3);
                break;
        }






    }
}