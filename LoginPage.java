import java.awt.*;
import java.awt.event.*;

public class LoginPage extends Frame implements ActionListener{
	TextField nameField, passField, resultField;
	Label lab1, lab2, lab3;
  
	public LoginPage(){
		setLayout(new GridLayout(3, 2, 0, 10));  
	
		nameField = new TextField(15);
		passField = new TextField(15);
		resultField = new TextField(15);
	
		lab1 = new Label("Username");
		lab2 = new Label("Password");
		lab3 = new Label("Display Result");

		passField.addActionListener(this);

		passField.setEchoChar('*');
		resultField.setEditable(false);

		add(lab1);	add(nameField);
		add(lab2);	add(passField);
		add(lab3);	add(resultField);

		setTitle("Login");
		setSize(300, 300);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}        
			});
	}
   
	public void actionPerformed(ActionEvent e){
		String str1 = nameField.getText();
		String str2 = passField.getText();

		if ( str1.equals("IceCereal") && str2.equals("Hunter2") ){
			resultField.setText("VALID");
		}
		else{
			resultField.setText("WRONG");
		}
	}
	
	public static void main(String args[]){
		new LoginPage();
   	}
}