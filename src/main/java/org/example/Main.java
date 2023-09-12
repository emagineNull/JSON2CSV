package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JTextArea textArea;
    private JTextArea textArea2;

    public Main() {

        frame = new JFrame();

        JButton button = new JButton("Convert");
        button.setBounds(50,275,120,30);
        JButton button2 = new JButton("Clear");
        button2.setBounds(300,275,120,30);
        button.addActionListener(this);
        button2.addActionListener(this);

        label = new JLabel("Json Input: ");
        label.setBounds(10,20,100,30);
        JLabel label2 = new JLabel("CSV Output: ");
        label2.setBounds(250,20,100,30);

        textArea = new JTextArea();
        textArea.setBounds(10,45, 200,200);
        textArea2 = new JTextArea();
        textArea2.setBounds(250,45, 200,200);

        /*panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 30, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(textArea);
        panel.add(textArea2);
        panel.add(button);
        panel.add(button2);
        //panel.add(label);*/

        //frame.add(panel);
        //frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JSON2CSV");
        frame.add(label);
        frame.add(label2);
        frame.add(textArea);
        frame.add(textArea2);
        frame.add(button);
        frame.add(button2);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 400);

    }
    public static void main(String[] args) {
        new Main();


        /*Scanner scanner = new Scanner(System.in);
        ArrayList<String> in = new ArrayList<>();

        in = JsonInput.readAndStore(in, scanner);

        String listString = String.join("\n", in);
        System.out.println(listString);
        assertTrue(JsonInput.isValid(listString));

        CSVOutput.printCSV(listString);*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Convert")) {
            // set the text of the label to the text of the field
            String jsonInput = textArea.getText();

            if (jsonInput == "" || !JsonInput.isValid(jsonInput))
                JOptionPane.showMessageDialog(frame, "Error :( This isn't valid JSON text.");
            // set the text of field to blank
            else
                textArea2.setText(CSVOutput.printCSV(jsonInput));
        }
        if (s.equals("Clear")) {
            textArea.setText(null);
            textArea2.setText(null);
        }
    }
}