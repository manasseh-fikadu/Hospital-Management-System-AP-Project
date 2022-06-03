import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
// import java.sql.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class LabTechnician {
    LabTechnician(){
        JFrame frame = new JFrame("Lab Technician");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel label = new JLabel("Hospital Management System Lab Technician");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setBounds(300,50,500,30);
        frame.add(label);
        JButton button = new JButton("Doctors Report");
        button.setBounds(400,120,150,30);
        frame.add(button);
        button.addActionListener(l -> {
            try{
                // Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from doctor");
                JFrame frame1 = new JFrame("Doctors Report");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
                JLabel label1 = new JLabel("Doctors Report");
                label1.setFont(new Font("Serif", Font.BOLD, 24));
                label1.setBounds(300,50,500,30);
                frame1.add(label1);
                JLabel label2 = new JLabel("Doctor ID");
                label2.setFont(new Font("Serif", Font.PLAIN, 18));
                label2.setBounds(250,120,100,30);
                frame1.add(label2);
                JLabel label3 = new JLabel("Doctor Name");
                label3.setFont(new Font("Serif", Font.PLAIN, 18));
                label3.setBounds(250,180,100,30);
                frame1.add(label3);
                JLabel label4 = new JLabel("Doctor Specialization");
                label4.setFont(new Font("Serif", Font.PLAIN, 18));
                label4.setBounds(250,240,150,30);
                frame1.add(label4);
                JLabel label5 = new JLabel("Doctor Phone");
                label5.setFont(new Font("Serif", Font.PLAIN, 18));
                label5.setBounds(250,300,150,30);
                frame1.add(label5);
                JLabel label6 = new JLabel("Doctor Email");
                label6.setFont(new Font("Serif", Font.PLAIN, 18));
                label6.setBounds(250,360,150,30);
                frame1.add(label6);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

        JButton button1 = new JButton("Send Report");
        button1.setBounds(400,200,150,30);
        frame.add(button1);
        button1.addActionListener(l -> {
            try{
                // Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                JFrame frame1 = new JFrame("Patients Report");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
                JLabel label1 = new JLabel("Patients Report");
                label1.setFont(new Font("Serif", Font.BOLD, 24));
                label1.setBounds(300,50,500,30);
                frame1.add(label1);
                JLabel label2 = new JLabel("Patient ID");
                label2.setFont(new Font("Serif", Font.PLAIN, 18));
                label2.setBounds(250,120,100,30);
                frame1.add(label2);
                JLabel label3 = new JLabel("Patient Name");
                label3.setFont(new Font("Serif", Font.PLAIN, 18));
                label3.setBounds(250,180,100,30);
                frame1.add(label3);
                JLabel label4 = new JLabel("Patient Phone");
                label4.setFont(new Font("Serif", Font.PLAIN, 18));
                label4.setBounds(250,240,150,30);
                frame1.add(label4);
                JLabel label5 = new JLabel("Patient Email");
                label5.setFont(new Font("Serif", Font.PLAIN, 18));
                label5.setBounds(250,300,150,30);
                frame1.add(label5);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

    }

    public static void main(String[] args) {
        new LabTechnician();
    }
}
