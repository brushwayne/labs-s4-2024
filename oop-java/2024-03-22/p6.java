import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p6 extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;

    public p6() {
        setTitle("String Operations");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create input field
        inputField = new JTextField(20);

        // Create output area
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        // Create buttons
        JButton smallButton = new JButton("Small");
        JButton capsButton = new JButton("Caps");
        JButton reverseButton = new JButton("Reverse");
        JButton vowelsButton = new JButton("Vowels");
        JButton caseButton = new JButton("Convert Case");
        JButton frequencyButton = new JButton("Frequency of Each Letter");
        JButton wordsButton = new JButton("Words");
        JButton beginCapsButton = new JButton("Begin Caps");
        JButton numOfLettersButton = new JButton("Number of Letters");

        // Add action listeners to buttons
        smallButton.addActionListener(this);
        capsButton.addActionListener(this);
        reverseButton.addActionListener(this);
        vowelsButton.addActionListener(this);
        caseButton.addActionListener(this);
        frequencyButton.addActionListener(this);
        wordsButton.addActionListener(this);
        beginCapsButton.addActionListener(this);
        numOfLettersButton.addActionListener(this);

        // Add components to content pane
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(inputField);
        panel.add(outputArea);
        panel.add(smallButton);
        panel.add(capsButton);
        panel.add(reverseButton);
        panel.add(vowelsButton);
        panel.add(caseButton);
        panel.add(frequencyButton);
        panel.add(wordsButton);
        panel.add(beginCapsButton);
        panel.add(numOfLettersButton);
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        String command = e.getActionCommand();
        String output = "";

        switch (command) {
            case "Small":
                output = input.toLowerCase();
                break;
            case "Caps":
                output = input.toUpperCase();
                break;
            case "Reverse":
                output = new StringBuilder(input).reverse().toString();
                break;
            case "Vowels":
                output = countVowels(input);
                break;
            case "Convert Case":
                output = convertCase(input);
                break;
            case "Frequency of Each Letter":
                output = frequencyOfEachLetter(input);
                break;
            case "Words":
                output = countWords(input);
                break;
            case "Begin Caps":
                output = capitalizeFirstLetterOfWords(input);
                break;
            case "Number of Letters":
                output = String.valueOf(input.length());
                break;
        }

        outputArea.setText(output);
    }

    private String countVowels(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return "Number of vowels: " + count;
    }

    private String convertCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }

    private String frequencyOfEachLetter(String input) {
        int[] frequency = new int[256]; // Assuming ASCII
        for (char c : input.toCharArray()) {
            frequency[c]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result.append((char) i).append(": ").append(frequency[i]).append("\n");
            }
        }
        return result.toString();
    }

    private String countWords(String input) {
        String[] words = input.split("\\s+");
        return "Number of words: " + words.length;
    }

    private String capitalizeFirstLetterOfWords(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (capitalize) {
                    result.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else {
                result.append(c);
                capitalize = true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new p6());
    }
}
