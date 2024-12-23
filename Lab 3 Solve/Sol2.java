import javax.swing.*;

public class Sol2{
    public static void main(String[] args) {
        // Prompt user to enter two positive integers
        String input1 = JOptionPane.showInputDialog("Enter the first positive integer:");
        String input2 = JOptionPane.showInputDialog("Enter the second positive integer:");

        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);

        // Find the GCD
        int gcd = findGCD(n1, n2);

        // Display the GCD
        JOptionPane.showMessageDialog(null, "The GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    private static int findGCD(int num1, int num2) {
        int min = Math.min(num1, num2);

        for (int i = min; i >= 1; i--) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                return i;
            }
        }

        return 1;
    }
}