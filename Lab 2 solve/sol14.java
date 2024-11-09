import java.util.Scanner;

public class sol14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the center of the circle (p, q): ");
        double p = input.nextDouble();
        double q = input.nextDouble();

        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();

        System.out.print("Enter the point coordinates (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x - p, 2) + Math.pow(y - q, 2));

        if (distance <= r) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
    }
}
