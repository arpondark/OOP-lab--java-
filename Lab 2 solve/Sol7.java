public class Sol7 {
    public static void main(String[] args) {
        double distanceKm = 14;
        double timeMinutes = 45;
        double timeSeconds = 30;

        double timeHours = (timeMinutes + timeSeconds / 60) / 60;

        double distanceMiles = distanceKm / 1.6;

        double speedMph = distanceMiles / timeHours;

        System.out.println("Average speed in miles per hour is : " + speedMph);
    }
}
