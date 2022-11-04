import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        boolean loggedIn = false;

        shop.addItem("Smartphone");
        shop.addItem("Laptop");
        shop.addItem("Headphones");

        System.out.println("Welcome to the sh0p!");
        System.out.println("To continue, please, enter your username:");
        String x = scanner.nextLine();
        User user = new User(x);

        loggedIn = true;
        System.out.println("Welcome to the sh0p, " + x + "!");
        shop.subscribe(user);

        while(loggedIn) {
            System.out.println("Press 1 to select item");
            System.out.println("Press 2 to select payment method");
            System.out.println("Press 0 to exit from system");
            x = scanner.nextLine();
            System.out.println("");

            if(x.equals("1")) {
                shop.sendAll();
                System.out.println("Enter the name of an item:");
                x = scanner.next();
                System.out.println("");

                if(shop.checkItem(x)){
                    ProductImplement productImplement = new ProductImplement();
                    productImplement.getItem(x);
                    Product product = new Memory(new Memory(new RAM(productImplement)));
                    System.out.println(product.decorate());
                }
                else System.out.println("Item is not found");
            }

            else if(x.equals("2")) {
                System.out.println("Press 1 to select Kaspi");
                System.out.println("Press 2 to select Halyk");
                System.out.println("Press any other key to go back to menu");
                x = scanner.next();
                System.out.println("");

                if(x.equals("1")) {
                    Payment payment = new Kaspi();
                    String paymentMethod = payment.pay();
                    System.out.println("You have paid via " + paymentMethod + " successfully");
                    System.out.println("");
                }

                else if(x.equals("2")) {
                    Payment halyk = new Halyk();
                    String paymentMethod = halyk.pay();
                    System.out.println("You have paid via " + paymentMethod + " successfully");
                    System.out.println("");
                }
            }

            else if(x.equals("0")) {
                loggedIn = false;
                System.out.println("exiting...");
                System.out.println("");
            }
        }
    }
}