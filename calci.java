import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class calci {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 269, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 11, 228, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBackground(UIManager.getColor("CheckBox.light"));
		btnBackspace.setBounds(10, 75, 57, 41);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBackground(UIManager.getColor("CheckBox.light"));
		btn7.setBounds(10, 116, 57, 41);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBackground(UIManager.getColor("CheckBox.light"));
		btn4.setBounds(10, 157, 57, 41);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(UIManager.getColor("CheckBox.light"));
		btn1.setBounds(10, 198, 57, 41);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBackground(UIManager.getColor("CheckBox.light"));
		btn0.setBounds(10, 239, 57, 41);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnClear.getText();
				textField.setText(number);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(UIManager.getColor("CheckBox.light"));
		btnClear.setBounds(68, 75, 57, 41);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBackground(UIManager.getColor("CheckBox.light"));
		btn8.setBounds(68, 116, 57, 41);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBackground(UIManager.getColor("CheckBox.light"));
		btn5.setBounds(68, 157, 57, 41);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBackground(UIManager.getColor("CheckBox.light"));
		btn2.setBounds(68, 198, 57, 41);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=".";
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBackground(UIManager.getColor("CheckBox.light"));
		btnDot.setBounds(68, 239, 57, 41);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBackground(UIManager.getColor("CheckBox.light"));
		btn00.setBounds(126, 75, 57, 41);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBackground(UIManager.getColor("CheckBox.light"));
		btn9.setBounds(126, 116, 57, 41);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBackground(UIManager.getColor("CheckBox.light"));
		btn6.setBounds(126, 157, 57, 41);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBackground(UIManager.getColor("CheckBox.light"));
		btn3.setBounds(126, 198, 57, 41);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBackground(UIManager.getColor("CheckBox.light"));
		btnEqual.setBounds(126, 239, 57, 41);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBackground(UIManager.getColor("CheckBox.light"));
		btnPlus.setBounds(184, 75, 57, 41);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBackground(UIManager.getColor("CheckBox.light"));
		btnSub.setBounds(184, 116, 57, 41);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBackground(UIManager.getColor("CheckBox.light"));
		btnMul.setBounds(184, 157, 57, 41);
		frame.getContentPane().add(btnMul);
		
		JButton btnDevide = new JButton("/");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDevide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDevide.setBackground(UIManager.getColor("CheckBox.light"));
		btnDevide.setBounds(184, 198, 57, 41);
		frame.getContentPane().add(btnDevide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBackground(UIManager.getColor("CheckBox.light"));
		btnPercent.setBounds(184, 239, 57, 41);
		frame.getContentPane().add(btnPercent);
	}
}
