import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

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

        JCheckBox box1 = new JCheckBox("Add");
        box1.setBounds(500, 150, 50, 50);
        frame.add(box1);

        JCheckBox box2 = new JCheckBox("Subtract");
        box2.setBounds(550, 150, 100, 50);
        frame.add(box2);

        box1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                box2.setSelected(false);
                box1.setSelected(true);
            }
        });

        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                box1.setSelected(false);
                box2.setSelected(true);
            }
        });

        JButton button = new JButton("SUBMIT");
        button.setBounds(500, 200, 100, 50);
        frame.add(button);

        JLabel label1 = new JLabel();
        label1.setBounds(500, 250, 400, 100);
        label1.setFont(new Font("Serif", Font.BOLD, 30));
        frame.add(label1);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(textField1.getText());
                double n2 = Double.parseDouble(textField2.getText());
                if(box1.isSelected()){
                    label1.setText("The sum is " + (n1+n2));
                }
                else if(box2.isSelected()){
                    label1.setText("The subtract is " + (n1-n2));
                }
                
            }
        });

        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}