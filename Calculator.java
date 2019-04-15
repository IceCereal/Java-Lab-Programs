import java.awt.*;
import java.awt.event.*;

class Calc implements ActionListener{
	Frame f = new Frame();

	Button num1 = new Button("1");
	Button num2 = new Button("2");
	Button num3 = new Button("3");
	Button num4 = new Button("4");
	Button num5 = new Button("5");
	Button num6 = new Button("6");
	Button num7 = new Button("7");
	Button num8 = new Button("8");
	Button num9 = new Button("9");
	Button num0 = new Button("0");

	Button sym_plus = new Button("+");
	Button sym_minus = new Button("-");
	Button sym_multiply = new Button("*");
	Button sym_divide = new Button("/");
	Button sym_eq = new Button("=");
	
	TextField output = new TextField();

	StringBuilder putText = new StringBuilder();
	int inputNum = 0;
	int tempNumber = 0;

	int actionToDo = 0;
	
	//Driver
	Calc(){
		num7.setBounds(40, 100, 40, 40);
		num8.setBounds(120, 100, 40, 40);
		num9.setBounds(200, 100, 40, 40);
		sym_plus.setBounds(280, 100, 40, 40);

		num4.setBounds(40, 180, 40, 40);
		num5.setBounds(120, 180, 40, 40);
		num6.setBounds(200, 180, 40, 40);
		sym_minus.setBounds(280, 180, 40, 40);

		num1.setBounds(40, 260, 40, 40);
		num2.setBounds(120, 260, 40, 40);
		num3.setBounds(200, 260, 40, 40);
		sym_multiply.setBounds(280, 260, 40, 40);

		num0.setBounds(40, 340, 200, 40);
		sym_divide.setBounds(280, 340, 40, 40);

		sym_eq.setBounds(280, 420, 40, 40);

		output.setBounds(40, 40, 280, 40);
		
		f.add(output);

		f.add(num7);
		f.add(num8);
		f.add(num9);
		f.add(sym_plus);
		
		f.add(num4);
		f.add(num5);
		f.add(num6);
		f.add(sym_minus);

		f.add(num1);
		f.add(num2);
		f.add(num3);
		f.add(sym_multiply);

		f.add(num0);
		f.add(sym_divide);

		f.add(sym_eq);

		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		num0.addActionListener(this);

		sym_divide.addActionListener(this);
		sym_minus.addActionListener(this);
		sym_multiply.addActionListener(this);
		sym_plus.addActionListener(this);
		sym_eq.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(360,500);
	}


  public static void main(String[] args) {
		new Calc();
	}
}
