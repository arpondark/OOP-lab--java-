import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, positive = 0, negative = 0;
        double sum = 0;

        System.out.println("Enter numbers (input ends with 0):");
        while (true) {
            int num = input.nextInt();
            if (num == 0)
                break;

            count++;
            sum += num;
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
        }

        double average = (count == 0) ? 0 : sum / count;
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.printf("Total: %.2f\nAverage: %.2f\n", sum, average);
    }
}
