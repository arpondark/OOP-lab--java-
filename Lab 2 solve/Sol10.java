import java.util.Scanner;

public class Sol10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean d2 = number % 2 == 0;
        boolean d3 = number % 3 == 0;

        if ((d2 || d3) && !(d2 && d3)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        scanner.close();
    }
}
