import java.util.Scanner;

public class Sol11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long minutesInYear = 365 * 24 * 60;
        long minutesInDay = 24 * 60;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
