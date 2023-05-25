package com.mycompany.loginform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

 class ShoppingCartApp extends JFrame {
    private JPanel mainPanel;
    private JPanel itemListPanel;
    private JPanel cartPanel;
    private JButton addToCartButton;
    private JTextArea cartTextArea;

    public ShoppingCartApp() {
        setTitle("Shopping Cart App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        itemListPanel = new JPanel();
        itemListPanel.setLayout(new BoxLayout(itemListPanel, BoxLayout.Y_AXIS));

        loadItemsFromFile(); // Load items from a text file

        JScrollPane itemListScrollPane = new JScrollPane(itemListPanel);
        mainPanel.add(itemListScrollPane, BorderLayout.CENTER);

        cartPanel = new JPanel();
        cartPanel.setLayout(new BorderLayout());

        addToCartButton = new JButton("Add to Cart");
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add the selected item to the cart and append to a text file
                Component selectedItem = itemListPanel.getComponentAt(itemListScrollPane.getViewport().getViewPosition());
                appendToCart(selectedItem);
            }
        });

        cartTextArea = new JTextArea();
        cartTextArea.setEditable(false);
        JScrollPane cartScrollPane = new JScrollPane(cartTextArea);

        cartPanel.add(addToCartButton, BorderLayout.NORTH);
        cartPanel.add(cartScrollPane, BorderLayout.CENTER);

        mainPanel.add(cartPanel, BorderLayout.EAST);

        add(mainPanel);
    }

    private void loadItemsFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("items.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                JButton itemButton = new JButton(line);
                itemListPanel.add(itemButton);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void appendToCart(Component item) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("cart.txt", true));
            writer.append((CharSequence) item);
            writer.newLine();
            writer.close();

            // Update the cart text area
            cartTextArea.append(item + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCartApp().setVisible(true);
            }
        });
    }
}
