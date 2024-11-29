import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        boolean[] isPresent = new boolean[100];

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (!isDistinct(numbers, isPresent, num)) {
                numbers[i] = num;
                isPresent[num] = true;
            } else {
                System.out.println(num + " is already present. Ignoring...");
            }
        }

        scanner.close();

        // Display distinct numbers
        System.out.print("Distinct numbers: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static boolean isDistinct(int[] numbers, boolean[] isPresent, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int countDistinctNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }
}