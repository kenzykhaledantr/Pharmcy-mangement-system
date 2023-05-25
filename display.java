package com.mycompany.loginform;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TextFileReaderGUI extends JFrame {

    private JTextArea textArea;

    public TextFileReaderGUI() {
        setTitle("Text File Reader");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        getContentPane().add(scrollPane);

        try {
            readFile("Drugs.txt"); // Replace "file.txt" with the path to your text file
        } catch (IOException e) {
            e.printStackTrace();
            textArea.setText("Error reading file!");
        }
    }

    private void readFile(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        reader.close();

        textArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextFileReaderGUI textFileReaderGUI = new TextFileReaderGUI();
            textFileReaderGUI.setVisible(true);
        });
    }
}
