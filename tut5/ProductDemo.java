import java.util.Scanner;

abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: Rs." + price);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Price: Rs." + finalPrice);
    }
}

class Electronics extends Product {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.15;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Product Category:");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Books");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        Product product;

        switch (choice) {
            case 1:
                product = new Electronics(id, name, price);
                break;

            case 2:
                product = new Clothing(id, name, price);
                break;

            case 3:
                product = new Books(id, name, price);
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("\nProduct Details:");
        product.display();

        sc.close();
    }
}
