import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class p3 extends JFrame implements ActionListener {

    private JList<String> colorList;
    private JButton changeButton;

    public p3() {
        super("Color Picker");

        // Create list of colors
        String[] colors = {"White", "Orange", "Red", "Blue"};
        colorList = new JList<>(colors);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Allow only one selection

        // Create change button
        changeButton = new JButton("Change Background Color");
        changeButton.addActionListener(this);

        // Add components to frame
        add(colorList);
        add(changeButton);

        // Layout components
        setLayout(null); // Adjust as needed for your layout preference
        colorList.setBounds(10, 10, 100, 100);
        changeButton.setBounds(120, 50, 200, 30);

        // Set frame size and visibility
        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeButton) {
            // Get selected color
            String selectedColor = (String) colorList.getSelectedValue();

            // Set background color based on selection
            Color newColor;
            switch (selectedColor) {
                case "White":
                    newColor = Color.WHITE;
                    break;
                case "Orange":
                    newColor = Color.ORANGE;
                    break;
                case "Red":
                    newColor = Color.RED;
                    break;
                case "Blue":
                    newColor = Color.BLUE;
                    break;
                default:
                    newColor = Color.WHITE;
            }

            getContentPane().setBackground(newColor);
        }
    }

    public static void main(String[] args) {
        new p3();
    }
}
