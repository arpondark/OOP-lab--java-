
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class flagOfJapan extends Canvas {

	 public static void main(String[] args) {
		 
		 JFrame frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		 Canvas canvas = new flagOfJapan();
		 canvas.setSize(600, 400);
		 frame.getContentPane().add(canvas);
		 
		
		 frame.pack();
		 frame.setVisible(true);
		
	 }

	 public void paint(Graphics g) {
		 
		 g.setColor(new Color(0,167,0));
		 g.fillRect(0, 0, 600, 400);
		
		 g.setColor(Color.RED);
		 g.fillOval(200, 100, 200, 200);
	 }
}