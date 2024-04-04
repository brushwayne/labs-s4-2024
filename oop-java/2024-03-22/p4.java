import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p4 extends JFrame implements ActionListener {

    private JPanel colorPanel;
    private JComboBox<Integer> redComboBox;
    private JComboBox<Integer> greenComboBox;
    private JComboBox<Integer> blueComboBox;
    private JButton selectButton;

    public p4() {
        super("RGB Color Picker");

        // Create color panel
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        // Create combo boxes (0-255 values)
        Integer[] values = new Integer[256];
        for (int i = 0; i < 256; i++) {
            values[i] = i;
        }
        redComboBox = new JComboBox<>(values);
        greenComboBox = new JComboBox<>(values);
        blueComboBox = new JComboBox<>(values);

        // Create select button
        selectButton = new JButton("Select Color");
        selectButton.addActionListener(this);

        // Create labels for combo boxes
        JLabel redLabel = new JLabel("Red:");
        JLabel greenLabel = new JLabel("Green:");
        JLabel blueLabel = new JLabel("Blue:");

        // Add components to frame
        add(colorPanel);
        add(redLabel);
        add(greenLabel);
        add(blueLabel);
        add(redComboBox);
        add(greenComboBox);
        add(blueComboBox);
        add(selectButton);

        // Layout components
        setLayout(null); // Adjust as needed for your layout preference
        colorPanel.setBounds(10, 10, 100, 100);
        redLabel.setBounds(120, 10, 40, 20);
        greenLabel.setBounds(120, 40, 40, 20);
        blueLabel.setBounds(120, 70, 40, 20);
        redComboBox.setBounds(170, 10, 50, 20);
        greenComboBox.setBounds(170, 40, 50, 20);
        blueComboBox.setBounds(170, 70, 50, 20);
        selectButton.setBounds(100, 120, 100, 30);

        // Set frame size and visibility
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectButton) {
            // Get selected values
            int red = (int) redComboBox.getSelectedItem();
            int green = (int) greenComboBox.getSelectedItem();
            int blue = (int) blueComboBox.getSelectedItem();

            // Create and set background color
            Color newColor = new Color(red, green, blue);
            colorPanel.setBackground(newColor);
            getContentPane().setBackground(newColor);
        }
    }

    public static void main(String[] args) {
        new p4();
    }
}
