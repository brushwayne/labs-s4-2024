// import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class p2 implements ActionListener {
    JFrame f;
    JButton add, subtract, multiply, reset;
    JPanel p;

    JLabel n1, n2, r1;
    JTextField num1, num2, result;

    public p2() {
        f = new JFrame("Program 2");
        f.setVisible(true);
        f.setSize(400, 600);

        add = new JButton("add");
        subtract = new JButton("subtract");
        multiply = new JButton("multiply");
        reset = new JButton("reset");

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        reset.addActionListener(this);

        p = new JPanel();
        f.getContentPane().add(p);

        n1 = new JLabel("Enter First Number: ");
        n2 = new JLabel("Enter Second Number: ");
        r1 = new JLabel("Result: ");

        num1 = new JTextField(10);
        num2 = new JTextField(10);
        result = new JTextField(10);

        p.add(n1); p.add(num1);
        p.add(n2); p.add(num2);
        p.add(r1); p.add(result);
        p.add(add); p.add(subtract); p.add(multiply); p.add(reset);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add) {
            int int_num1 = Integer.parseInt(num1.getText());
            int int_num2 = Integer.parseInt(num2.getText());

            result.setText(Integer.toString(int_num1 + int_num2));
        }

        if(e.getSource() == subtract) {
            int int_num1 = Integer.parseInt(num1.getText());
            int int_num2 = Integer.parseInt(num2.getText());

            result.setText(Integer.toString(int_num1 - int_num2));
        }

        if(e.getSource() == multiply) {
            int int_num1 = Integer.parseInt(num1.getText());
            int int_num2 = Integer.parseInt(num2.getText());

            result.setText(Integer.toString(int_num1 * int_num2));
        }

        if(e.getSource() == reset) {
            num1.setText("");
            num2.setText("");
            result.setText("");
        }
    }

    public static void main(String args[]) {
        p2 program = new p2();
    }
}
