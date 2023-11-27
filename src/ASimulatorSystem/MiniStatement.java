package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {

    private JButton exitButton;
    private JLabel bankLabel, cardNumberLabel, transactionHistoryLabel, balanceLabel;

    public MiniStatement(String pin) {
        super("Mini Statement");

        // Set frame properties
        getContentPane().setBackground(Color.WHITE);
        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);

        // Labels initialization
        bankLabel = new JLabel("Indian Bank");
        bankLabel.setBounds(150, 20, 100, 20);
        add(bankLabel);

        cardNumberLabel = new JLabel();
        cardNumberLabel.setBounds(20, 80, 300, 20);
        add(cardNumberLabel);

        transactionHistoryLabel = new JLabel();
        transactionHistoryLabel.setBounds(20, 140, 400, 200);
        add(transactionHistoryLabel);

        balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 400, 300, 20);
        add(balanceLabel);

        // Retrieve card number from the database
        try {
            Conn connection = new Conn();
            ResultSet resultSet = connection.s.executeQuery("select * from login where pin = '" + pin + "'");
            while (resultSet.next()) {
                cardNumberLabel.setText("Card Number:    " + resultSet.getString("cardno").substring(0, 4) + "XXXXXXXX" + resultSet.getString("cardno").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retrieve transaction history and calculate balance
        try {
            int balance = 0;
            Conn connection1 = new Conn();
            ResultSet resultSet = connection1.s.executeQuery("SELECT * FROM bank where pin = '" + pin + "'");
            while (resultSet.next()) {
                transactionHistoryLabel.setText(transactionHistoryLabel.getText() + "<html>" + resultSet.getString("date") +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("mode") +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");

                if (resultSet.getString("mode").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            balanceLabel.setText("Your total Balance is Rs " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Exit button initialization
        exitButton = new JButton("Exit");
        exitButton.setBounds(20, 500, 100, 25);
        add(exitButton);

        // Add action listener to the exit button
        exitButton.addActionListener(this);
    }

    // ActionListener implementation for the exit button
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new MiniStatement("").setVisible(true);
    }
}
