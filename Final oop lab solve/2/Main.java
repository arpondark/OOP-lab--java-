import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pattern Printer");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label = new JLabel("Enter a number:");
        label.setBounds(10, 20, 150, 25);
        panel.add(label);

        JTextField textField = new JTextField(20);
        textField.setBounds(150, 20, 165, 25);
        panel.add(textField);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 80, 300, 200);
        panel.add(textArea);

        JButton button = new JButton("Print Pattern");
        button.setBounds(10, 50, 150, 25);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(textField.getText());
                String pattern = "";
                for (int i = 1; i <= n; i++) {

                    for (int j = 0; j < (n - i); j++) {
                        pattern += "  "; 
                    }

                    for (int j = 0; j < i; j++) {
                        pattern += "*"; 
                    }
                    pattern += "\n"; 
                }
                textArea.setText(pattern);
            }
        });
    }
}
