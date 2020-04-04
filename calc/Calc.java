package calc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;



public class Calc implements ActionListener {
		JTextField t1;
		JTextField t2, t3;
		JButton add, sub, div, mul, pow;
		JFrame f;
		Calc(){
			f = new JFrame();
			t1 = new JTextField();
			t1.setBounds(50, 50, 150, 20);
			t2 = new JTextField();
			t2.setBounds(50,100,150,20);
			t3 = new JTextField();
			t3.setBounds(50,150,150,20);
			add = new JButton("+");
			add.setBounds(50,200,50,50);
			sub = new JButton("-");
			sub.setBounds(100,200,50,50);
			mul = new JButton("*");
			mul.setBounds(150,200,50,50);
			div = new JButton("/");
			div.setBounds(75,250,50,50);
			pow = new JButton("**");
			pow.setBounds(125,250,50,50);
			add.addActionListener(this);
			sub.addActionListener(this);
			mul.addActionListener(this);
			div.addActionListener(this);
			pow.addActionListener(this);
			f.add(t1);
			f.add(t2);
			f.add(t3);
			f.add(add);
			f.add(sub);
			f.add(mul);
			f.add(div);
			f.add(pow);
			f.setSize(300,300);
			f.setLayout(null);
			f.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			String s1 = t1.getText();
			String s2 = t2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = 0;
			if(e.getSource()==add) {
				c = a+b;
			}
			else if(e.getSource()==sub) {
				c = a-b;
			}
			else if(e.getSource()==mul) {
				c = a*b;
			}
			else if(e.getSource()==div) {
				try {
					c = a/b;
				}
				catch(Exception q) {
					System.out.println("Please Enter Valid Integers");
				}
			}
			else if(e.getSource()==pow) {
				c = (int) Math.pow(a, b);
			}
				String result = String.valueOf(c);
				t3.setText(result);
				
			}
			
		
		public static void main(String[] args) {
			new Calc();
		}
		
}
