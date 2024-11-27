import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        boolean[] isPresent = new boolean[100]; // Assuming the range of input numbers is 0 to 99

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
            if (numbers[i] != 0) { // Assuming 0 is not used as an input number
                System.out.print(numbers[i] + " ");
            }
        }
    }

    // Helper method to check if a number is already present in the array
    public static boolean isDistinct(int[] numbers, boolean[] isPresent, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return true;
            }
        }
        return false;
    }

    // Helper method to count distinct numbers
    public static int countDistinctNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num != 0) { // Assuming 0 is not used as an input number
                count++;
            }
        }
        return count;
    }
}