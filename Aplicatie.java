package aplicatie1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aplicatie implements ActionListener {

	Font myFont1 = new Font("Zen Dots", Font.BOLD, 23);

	JFrame frame;
	JTextField input;
	JButton[] numButtons = new JButton[10];
	JButton[] commandButtons = new JButton[6];
	JButton add, minus, divide, multiply, equal, clear;
	JPanel panel;

	int first, second, result;
	char operator;

	Aplicatie() {
		ImageIcon icon = new ImageIcon("calculator.png");

		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(220, 295);
		frame.setLayout(null);
		frame.setIconImage(icon.getImage());
		frame.getContentPane().setBackground(new Color(158, 209, 222));

		input = new JTextField();
		input.setBounds(5, 5, 193, 45);
		input.setFont(myFont1);
		input.setEditable(false);
		input.setBackground(new Color(209, 222, 224));

		add = new JButton("+");
		minus = new JButton("-");
		divide = new JButton("/");
		multiply = new JButton("*");
		equal = new JButton("=");
		clear = new JButton("C");

		commandButtons[0] = add;
		commandButtons[1] = minus;
		commandButtons[2] = divide;
		commandButtons[3] = multiply;
		commandButtons[4] = equal;
		commandButtons[5] = clear;

		for (int i = 0; i < 6; i++) {
			commandButtons[i].addActionListener(this);
			commandButtons[i].setFont(myFont1);
			commandButtons[i].setFocusable(false);
			commandButtons[i].setBorder(null);

		}

		for (int i = 0; i < 10; i++) {
			numButtons[i] = new JButton(String.valueOf(i));
			numButtons[i].addActionListener(this);
			numButtons[i].setFont(myFont1);
			numButtons[i].setFocusable(false);
			numButtons[i].setBorder(null);

		}

		panel = new JPanel();
		panel.setBounds(4, 55, 195, 197);
		panel.setLayout(new GridLayout(4, 4, 3, 3));
		panel.setBackground(new Color(158, 209, 222));

		panel.add(numButtons[1]);
		panel.add(numButtons[2]);
		panel.add(numButtons[3]);
		panel.add(add);
		panel.add(numButtons[4]);
		panel.add(numButtons[5]);
		panel.add(numButtons[6]);
		panel.add(minus);
		panel.add(numButtons[7]);
		panel.add(numButtons[8]);
		panel.add(numButtons[9]);
		panel.add(divide);
		panel.add(equal);
		panel.add(numButtons[0]);
		panel.add(clear);
		panel.add(multiply);

		frame.setVisible(true);
		frame.add(panel);
		frame.add(input);
		frame.setResizable(false);

	}

	public static void main(String[] args) {

		Aplicatie calculator = new Aplicatie();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numButtons[i]) {
				input.setText(input.getText().concat(String.valueOf(i)));
			}
		}

		if (e.getSource() == add) {
			first = Integer.parseInt(input.getText());
			operator = '+';
			input.setText("");
		}

		if (e.getSource() == minus) {
			first = Integer.parseInt(input.getText());
			operator = '-';
			input.setText("");
		}
		if (e.getSource() == divide) {
			first = Integer.parseInt(input.getText());
			operator = '-';
			input.setText("");
		}
		if (e.getSource() == multiply) {
			first = Integer.parseInt(input.getText());
			operator = '-';
			input.setText("");
		}
		if (e.getSource() == equal) {
			second = Integer.parseInt(input.getText());

			switch (operator) {
			case '+':
				result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case '/':
				result = first / second;
				break;
			case '*':
				result = first * second;
				break;

			}
			input.setText(String.valueOf(result));
			first = result;

		}
		if (e.getSource() == clear) {
			input.setText("");
		}

	}

}