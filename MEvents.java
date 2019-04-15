import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MEBoi{
	
	public static void main(String[] args) {
		Frame frame = new Frame("OOooooh");

		final JLabel label = new JLabel();
    		frame.add(label);
	
		frame.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent me) { 
				label.setText("Mouse Pressed");
			}
			public void mouseReleased(MouseEvent me) { 
				label.setText("Mouse Released");
			}
			public void mouseEntered(MouseEvent me) { 
				label.setText("Mouse Entered");
			}
			public void mouseExited(MouseEvent me) { 
				label.setText("Mouse Exited");
			}
			public void mouseClicked(MouseEvent me) { 
				label.setText("Mouse Clicked");
			}
		    });

		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		frame.setSize(500,500);
		frame.setVisible(true);	

	}	
}
