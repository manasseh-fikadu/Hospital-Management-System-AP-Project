import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
// import java.sql.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class Patient {
    Patient(){
        JFrame frame = new JFrame("Patient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel label = new JLabel("Hospital Management System Login");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setBounds(300,50,500,30);
        frame.add(label);
        JButton button = new JButton("Fill in Credientials");
        button.setBounds(400,100,200,30);
        frame.add(button);
        JButton button1 = new JButton("Check Doctors Availability");
        button1.setBounds(400,150,200,30);
        frame.add(button1);
        JButton button2 = new JButton("Prescribed Medicines");
        button2.setBounds(400,200,200,30);
        frame.add(button2);
        button.addActionListener(l -> {
            frame.dispose();
            new Appointment();
        });
        button1.addActionListener(l -> {
            frame.dispose();
            JFrame frame1 = new JFrame("Patient");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setSize(1000,600);
            frame1.setLocationRelativeTo(null);
            frame1.setResizable(false);
            frame1.setLayout(null);
            frame1.setVisible(true);
        });
        button2.addActionListener(l -> {
            frame.dispose();
            JFrame frame2 = new JFrame("Patient");
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(1000,600);
            frame2.setLocationRelativeTo(null);
            frame2.setResizable(false);
            frame2.setLayout(null);
            frame2.setVisible(true);
        });
    }

    public static void main(String[] args) {
        new Patient();
    }
}

