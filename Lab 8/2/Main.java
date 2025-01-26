import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            products.add(new Product(name, quantity, price));
        }

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {

                int nameCompare = p1.name.compareTo(p2.name);
                if (nameCompare != 0) {
                    return nameCompare;
                }

                int priceCompare = Double.compare(p2.price, p1.price);
                if (priceCompare != 0) {
                    return priceCompare;
                }

                return Integer.compare(p1.quantity, p2.quantity);
            }
        });

        System.out.println("Sorted Product List:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
