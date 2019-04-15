import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KEBoi{
	public static void main(String[] args) {
		Frame frame = new Frame("KeyEvents");

		final JLabel label = new JLabel();
		frame.add(label);

		frame.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent ke){
				label.setText("KEY TYPED:\t"+ke);
			}
			public void keyPressed(KeyEvent ke){
				label.setText("KEY PRESSED:\t"+ke);
			}
			public void keyReleased(KeyEvent ke){
				label.setText("KEY RELEASED:\t"+ke);
			}
		
		});

		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		frame.setSize(192,108);
		frame.setVisible(true);	
	}
}
