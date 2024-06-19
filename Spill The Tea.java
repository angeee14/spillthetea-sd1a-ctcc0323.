import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spillthetea {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Food Ordering and Milk Tea");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the panel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        // Set the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Create labels and text fields for customer information
        JLabel userLabel = new JLabel("Name:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(10, 50, 80, 25);
        panel.add(addressLabel);

        JTextField addressText = new JTextField(20);
        addressText.setBounds(100, 50, 165, 25);
        panel.add(addressText);

        // Create combo boxes for food and milk tea selection
        JLabel foodLabel = new JLabel("Food:");
        foodLabel.setBounds(10, 80, 80, 25);
        panel.add(foodLabel);

        String[] foodItems = { "Pizza", "Burger", "Sushi", "Salad" };
        JComboBox<String> foodList = new JComboBox<>(foodItems);
        foodList.setBounds(100, 80, 165, 25);
        panel.add(foodList);

        JLabel milkTeaLabel = new JLabel("Milk Tea:");
        milkTeaLabel.setBounds(10, 110, 80, 25);
        panel.add(milkTeaLabel);

        String[] milkTeaItems = { "Classic", "Taro", "Matcha", "Chocolate" };
        JComboBox<String> milkTeaList = new JComboBox<>(milkTeaItems);
        milkTeaList.setBounds(100, 110, 165, 25);
        panel.add(milkTeaList);

        // Create order button
        JButton orderButton = new JButton("Order");
        orderButton.setBounds(10, 150, 80, 25);
        panel.add(orderButton);

        // Create an area to display the order summary
        JTextArea orderSummary = new JTextArea();
        orderSummary.setBounds(100, 150, 265, 100);
        orderSummary.setEditable(false);
        panel.add(orderSummary);

        // Add action listener to the order button
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = userText.getText();
                String address = addressText.getText();
                String food = (String) foodList.getSelectedItem();
                String milkTea = (String) milkTeaList.getSelectedItem();

                String summary = "Order Summary:\n";
                summary += "Name: " + name + "\n";
                summary += "Address: " + address + "\n";
                summary += "Food: " + food + "\n";
                summary += "Milk Tea: " + milkTea + "\n";

                orderSummary.setText(summary);
            }
        });
    }
}
