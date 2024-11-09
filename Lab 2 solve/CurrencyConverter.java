import javax.swing.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        String rateStr = JOptionPane.showInputDialog(null, "Enter the exchange rate (USD to BDT):", "Exchange Rate", JOptionPane.QUESTION_MESSAGE);
        double rate = Double.parseDouble(rateStr);

        String choiceStr = JOptionPane.showInputDialog(null, "Enter 0 to convert USD to BDT, or 1 to convert BDT to USD:", "Conversion Choice", JOptionPane.QUESTION_MESSAGE);
        int choice = Integer.parseInt(choiceStr);

        if (choice == 0) {
            String usdStr = JOptionPane.showInputDialog(null, "Enter amount in USD:", "USD to BDT", JOptionPane.QUESTION_MESSAGE);
            double usd = Double.parseDouble(usdStr);
            double bdt = usd * rate;
            JOptionPane.showMessageDialog(null, usd + " USD is " + bdt + " BDT", "Conversion Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (choice == 1) {
            String bdtStr = JOptionPane.showInputDialog(null, "Enter amount in BDT:", "BDT to USD", JOptionPane.QUESTION_MESSAGE);
            double bdt = Double.parseDouble(bdtStr);
            double usd = bdt / rate;
            JOptionPane.showMessageDialog(null, bdt + " BDT is " + usd + " USD", "Conversion Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
