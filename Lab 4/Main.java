import java.util.Scanner;

class Icecream {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    public Icecream(String type, String company, double price) {
        this.icecreamType = type;
        this.icecreamCompany = company;
        this.icecreamPrice = price;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    @Override
    public String toString() {
        return "Type: " + icecreamType + ", Company: " + icecreamCompany + ", Price: " + icecreamPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Icecream[] icecreamArray = new Icecream[5];

        for (int i = 0; i < icecreamArray.length; i++) {
            System.out.println("Enter details for ice cream " + (i + 1) + " (type, company, price):");
            String type = scanner.next();
            String company = scanner.next();
            double price = scanner.nextDouble();
            icecreamArray[i] = new Icecream(type, company, price);
        }

        System.out.println("Enter the company name to search:");
        String searchCompany = scanner.next();
        searchByCompany(icecreamArray, searchCompany);

        scanner.close();
    }

    public static void searchByCompany(Icecream[] icecreams, String company) {
        for (Icecream icecream : icecreams) {
            if (icecream.getIcecreamCompany().equalsIgnoreCase(company)) {
                System.out.println(icecream);
            }
        }
    }
}
