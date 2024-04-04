import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Event1 implements ActionListener
{
	JFrame f1;
	JButton b1;
	JPanel p1;
	public Event1 ()
	{
		f1=new JFrame("My First Frame");
		f1.setVisible(true);
		f1.setSize(400,400);
		b1=new JButton("Click Me");
		p1=new JPanel();
		f1.getContentPane().add(p1);
		p1.add(b1);
		b1.addActionListener(this);
	}
	//overide start
	public void actionPerformed(ActionEvent e)
	{
		p1.setBackground(Color.cyan);
		System.out.println("My prog is working fine");
	}
	public static void main(String args[])
	{
		Event1 obj=new Event1();
	}
}