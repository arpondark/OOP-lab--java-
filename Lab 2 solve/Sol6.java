import java.util.Scanner;

public class Sol6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();
        double p = 2 * Math.PI * r;
        double a = Math.PI * r * r;
        System.out.println("Perimeter: " + p);
        System.out.println("Area: " + a);
        scanner.close();
    }

}
