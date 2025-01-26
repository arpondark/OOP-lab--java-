import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JPanel {
    private int x = 50, y = 50;        // Ball's initial position
    private int diameter = 30;         // Ball's diameter
    private int xSpeed = 2, ySpeed = 2; // Ball's speed

    public BouncingBall() {
        // Set the preferred size of the JPanel
        setPreferredSize(new Dimension(600, 400));
        // Start the animation
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveBall();
                repaint();  // Repaint the panel
            }
        });
        timer.start();
    }

    // Method to move the ball and detect collision
    private void moveBall() {
        // Update ball position
        x += xSpeed;
        y += ySpeed;

        // Check for collision with the left or right walls
        if (x <= 0 || x + diameter >= getWidth()) {
            xSpeed = -xSpeed;  // Reverse horizontal direction
        }

        // Check for collision with the top or bottom walls
        if (y <= 0 || y + diameter >= getHeight()) {
            ySpeed = -ySpeed;  // Reverse vertical direction
        }
    }

    // Method to paint the ball onto the JPanel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);  // Set ball color
        g.fillOval(x, y, diameter, diameter);  // Draw the ball
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall bouncingBall = new BouncingBall();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(bouncingBall);
        frame.pack();
        frame.setVisible(true);
    }
}
