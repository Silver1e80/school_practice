package nine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJFrame extends JFrame implements ActionListener{
	private JPanel contentPane;
	JButton btn1,btn2,btn3;
	MyJFrame(){
		setTitle("�q�q��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JButton("�ŤM");
		btn1.addActionListener(this);
		btn1.setBounds(70,100,90,25);
		contentPane.add(btn1);
			
		btn2 = new JButton("���Y");
		btn2.addActionListener(this);
		btn2.setBounds(170,100,90,25);
		contentPane.add(btn2);
			
		btn3 = new JButton("��");
		btn3.addActionListener(this);
		btn3.setBounds(270,100,90,25);
		contentPane.add(btn3);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		JButton hitBtn = (JButton)e.getSource();
		
		String[] t = new String[3];
		t[0]="�ŤM";
		t[1]="���Y";
		t[2]="��";		
		String a = t[(int)(Math.random()*3)];
		
		if(hitBtn.getText()=="�ŤM"&&a=="�ŤM")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n����");
		else if(hitBtn.getText()=="�ŤM"&&a=="���Y")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n�A��F");
		else if(hitBtn.getText()=="�ŤM"&&a=="��")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n�AĹ�F");
		else if(hitBtn.getText()=="���Y"&&a=="�ŤM")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n�AĹ�F");
		else if(hitBtn.getText()=="���Y"&&a=="���Y")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n����");
		else if(hitBtn.getText()=="���Y"&&a=="��")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n�A��F");
		else if(hitBtn.getText()=="��"&&a=="�ŤM")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n�A��F");
		else if(hitBtn.getText()=="��"&&a=="���Y")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n�AĹ�F");
		else if(hitBtn.getText()=="��"&&a=="��")
			JOptionPane.showMessageDialog(null, "�A�X"+hitBtn.getText()+"\n"+"�q���X"+a+"\n����");
	}
}
public class JFrameDemo {
	public static void main(String[] args){
		MyJFrame f = new MyJFrame();	
	}
}
