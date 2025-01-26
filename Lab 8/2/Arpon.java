import java.util.*;

class Product implements Comparable<Product> {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int compareTo(Product p) {
        int n = this.name.compareTo(p.name);
        if (n != 0) return n;
        int pr = Double.compare(this.price, p.price);
        if (pr != 0) return pr;
        return Integer.compare(this.quantity, p.quantity);
    }

    public String toString() {
        return this.name + " " + this.quantity + " " + this.price;
    }
}

public class Arpon {
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

        Collections.sort(products);

        System.out.println("Sorted Product List:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

