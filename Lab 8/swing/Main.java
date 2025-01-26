import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("JAVA GUI");
        frame.getContentPane().setBackground(Color.CYAN);

        
        JTextField textField1 = new JTextField();
        textField1.setBounds(500, 50, 200, 50);
        frame.add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setBounds(500, 100, 200, 50);
        frame.add(textField2);

    
        JCheckBox addBox = new JCheckBox("Add");
        addBox.setBounds(500, 150, 70, 50);
        frame.add(addBox);

        JCheckBox subtractBox = new JCheckBox("Subtract");
        subtractBox.setBounds(570, 150, 100, 50);
        frame.add(subtractBox);

        JCheckBox multiplyBox = new JCheckBox("Multiply");
        multiplyBox.setBounds(500, 200, 100, 50);
        frame.add(multiplyBox);

        JCheckBox divideBox = new JCheckBox("Divide");
        divideBox.setBounds(600, 200, 80, 50);
        frame.add(divideBox);

        
        addBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addBox.isSelected()) {
                    subtractBox.setSelected(false);
                    multiplyBox.setSelected(false);
                    divideBox.setSelected(false);
                }
            }
        });

        subtractBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (subtractBox.isSelected()) {
                    addBox.setSelected(false);
                    multiplyBox.setSelected(false);
                    divideBox.setSelected(false);
                }
            }
        });

        multiplyBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (multiplyBox.isSelected()) {
                    addBox.setSelected(false);
                    subtractBox.setSelected(false);
                    divideBox.setSelected(false);
                }
            }
        });

        divideBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (divideBox.isSelected()) {
                    addBox.setSelected(false);
                    subtractBox.setSelected(false);
                    multiplyBox.setSelected(false);
                }
            }
        });

      
        JButton button = new JButton("SUBMIT");
        button.setBounds(500, 250, 100, 50);
        frame.add(button);
       
        JLabel label1 = new JLabel();
        label1.setBounds(500, 300, 400, 100);
        label1.setFont(new Font("Serif", Font.BOLD, 30));
        frame.add(label1);

        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(textField1.getText());
                    double n2 = Double.parseDouble(textField2.getText());

                    
                    if (addBox.isSelected()) {
                        label1.setText("The sum is " + (n1 + n2));
                    } else if (subtractBox.isSelected()) {
                        label1.setText("The difference is " + (n1 - n2));
                    } else if (multiplyBox.isSelected()) {
                        label1.setText("The Multiply is " + (n1 * n2));
                    } else if (divideBox.isSelected()) {
                        if (n2 != 0) {
                            label1.setText("The Division is " + (n1 / n2));
                        } else {
                            label1.setText("Infinity!");
                        }
                    } else {
                        label1.setText("No operation!");
                    }
                } catch (NumberFormatException ex) {
                    label1.setText("Invalid input. Please enter numbers.");
                }
            }
        });

        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
