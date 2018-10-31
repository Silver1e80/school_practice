package nine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJFrame extends JFrame implements ActionListener{
	private JPanel contentPane;
	JButton btn1,btn2,btn3;
	MyJFrame(){
		setTitle("猜猜拳");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JButton("剪刀");
		btn1.addActionListener(this);
		btn1.setBounds(70,100,90,25);
		contentPane.add(btn1);
			
		btn2 = new JButton("石頭");
		btn2.addActionListener(this);
		btn2.setBounds(170,100,90,25);
		contentPane.add(btn2);
			
		btn3 = new JButton("布");
		btn3.addActionListener(this);
		btn3.setBounds(270,100,90,25);
		contentPane.add(btn3);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		JButton hitBtn = (JButton)e.getSource();
		
		String[] t = new String[3];
		t[0]="剪刀";
		t[1]="石頭";
		t[2]="布";		
		String a = t[(int)(Math.random()*3)];
		
		if(hitBtn.getText()=="剪刀"&&a=="剪刀")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n平手");
		else if(hitBtn.getText()=="剪刀"&&a=="石頭")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n你輸了");
		else if(hitBtn.getText()=="剪刀"&&a=="布")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n你贏了");
		else if(hitBtn.getText()=="石頭"&&a=="剪刀")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n你贏了");
		else if(hitBtn.getText()=="石頭"&&a=="石頭")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n平手");
		else if(hitBtn.getText()=="石頭"&&a=="布")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n你輸了");
		else if(hitBtn.getText()=="布"&&a=="剪刀")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n你輸了");
		else if(hitBtn.getText()=="布"&&a=="石頭")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n你贏了");
		else if(hitBtn.getText()=="布"&&a=="布")
			JOptionPane.showMessageDialog(null, "你出"+hitBtn.getText()+"\n"+"電腦出"+a+"\n平手");
	}
}
public class JFrameDemo {
	public static void main(String[] args){
		MyJFrame f = new MyJFrame();	
	}
}
