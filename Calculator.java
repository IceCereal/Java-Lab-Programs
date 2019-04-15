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


  public static void main(String[] args) {
		new Calc();
	}
}
