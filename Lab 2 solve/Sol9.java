import java.util.Scanner;

public class Sol9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius : ");
        double c = sc.nextDouble();
        double fahrenheit = (9.0 / 5) * c + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();
    }

}
