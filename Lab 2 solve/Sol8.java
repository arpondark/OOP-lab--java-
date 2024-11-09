import java.util.Scanner;

public class Sol8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double distanceKm = scanner.nextDouble();

        System.out.print("Enter the time in minutes: ");
        double timeMinutes = scanner.nextDouble();

        System.out.print("Enter the time in seconds: ");
        double timeSeconds = scanner.nextDouble();

        double timeHours = (timeMinutes + timeSeconds / 60) / 60;

        double distanceMiles = distanceKm / 1.6;

        double speedMph = distanceMiles / timeHours;

        System.out.println("Average speed in miles per hour is : " + speedMph);
        scanner.close();

    }

}
