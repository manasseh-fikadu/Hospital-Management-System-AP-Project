import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class SignUp {
    SignUp(){
        JFrame frame = new JFrame("Sign Up");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel label = new JLabel("Hospital Management System Sign Up");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setBounds(300,50,500,30);
        frame.add(label);
        JLabel label1 = new JLabel("Username");
        label1.setFont(new Font("Serif", Font.PLAIN, 18));
        label1.setBounds(250,120,100,30);
        frame.add(label1);
        JLabel label2 = new JLabel("Password");
        label2.setFont(new Font("Serif", Font.PLAIN, 18));
        label2.setBounds(250,180,100,30);
        frame.add(label2);
        JLabel label3 = new JLabel("Confirm Password");
        label3.setFont(new Font("Serif", Font.PLAIN, 18));
        label3.setBounds(250,240,150,30);
        frame.add(label3);
        JTextField text1 = new JTextField();
        text1.setBounds(400,120,200,30);
        frame.add(text1);
        JPasswordField text2 = new JPasswordField();
        text2.setBounds(400,180,200,30);
        frame.add(text2);
        JPasswordField text3 = new JPasswordField();
        text3.setBounds(400,240,200,30);
        frame.add(text3);
        JButton button = new JButton("Sign Up");
        button.setBounds(300,300,100,30);
        frame.add(button);
        JButton button1 = new JButton("Back");
        button1.setBounds(450,300,100,30);
        frame.add(button1);
        button1.addActionListener(l->{
            frame.dispose();
            new Login();
        });
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
