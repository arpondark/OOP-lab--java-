import java.util.Scanner;

public class sol4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[101];

        while (true) {
            int num = scanner.nextInt();
            if (num == 0)
                break;
            if (num >= 1 && num <= 100)
                counts[num]++;
        }

        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + ": " + counts[i]);
            }
        }

        scanner.close();
    }
}