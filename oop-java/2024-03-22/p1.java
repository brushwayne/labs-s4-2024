import java.awt.*;
import javax.swing.*;

public class p1
{
	JFrame f1;
	JButton b1;
	JPanel p1;
	JTextArea jta1;

	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JRadioButton jr1,jr2;

	JCheckBox jcb1,jcb2;

	ButtonGroup bg1;

	JComboBox jc1;

	Icon i1;

	JList jl1;

	public p1()
	{
		f1 = new JFrame("My First Frame");
		f1.setVisible(true);
		f1.setSize(400,400);

		b1 = new JButton("Click Me");
		p1 = new JPanel();
		f1.getContentPane().add(p1);

		//p1.setBackground(Color.cyan);
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.red);

		l1 = new JLabel("First Name");
		t1 = new JTextField(10);
		jta1 = new JTextArea(5,7);

		jr1 = new JRadioButton("Male");
		jr2 = new JRadioButton("Female");
		bg1 = new ButtonGroup();

		bg1.add(jr1);
		bg1.add(jr2);

		jcb1 = new JCheckBox("Eating");
		jcb2 = new JCheckBox("Sleeping");

		String x[] = {"Matric", "+2", "B.Tech","M.Tech", "Ph.D", "TTMP","NFTE"};
		jc1 = new JComboBox(x);

		l2 = new JLabel("     ");
		i1 = new ImageIcon("./assets/1.jpg");
		l2.setIcon(i1);
		jl1 = new JList(x);

		p1.add(l1);
		p1.add(t1);
		p1.add(jta1);
		p1.add(jr1);
		p1.add(jr2);
		p1.add(jcb1);
		p1.add(jcb2);
		p1.add(jc1);
		p1.add(l2);
		p1.add(jl1);
		p1.add(b1);
	}

	public static void main(String args[])
	{
		p1 obj = new p1();
	}
}