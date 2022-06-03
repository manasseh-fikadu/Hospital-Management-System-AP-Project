import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
// import java.sql.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class Main {
    Main(){
        JFrame frame = new JFrame("Admin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel label = new JLabel("Hospital Management System Admin");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setBounds(300,50,500,30);
        frame.add(label);

        JButton button = new JButton("Manage Schedule");
        button.setBounds(400,100,200,30);
        frame.add(button);
        button.addActionListener(l -> {
            try{
                // Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                frame.dispose();
                JFrame frame1 = new JFrame("Manage Schedule");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

        JButton button1 = new JButton("Patients Detail");
        button1.setBounds(400,150,200,30);
        frame.add(button1);
        button1.addActionListener(l -> {
            try{
                // Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                frame.dispose();
                JFrame frame1 = new JFrame("Patient Detail");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
            }
                    catch(Exception e){
                        System.out.println(e);
                    }
            });
        JButton button2 = new JButton("Doctors Detail");
        button2.setBounds(400,200,200,30);
        frame.add(button2);
        button2.addActionListener(l1 -> {
                try{
                    // Class.forName("com.mysql.jdbc.Driver");
                    // Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                    // Statement stmt1 = con1.createStatement();
                    // ResultSet rs1 = stmt1.executeQuery("select * from patient");
                    frame.dispose();
                    JFrame frame2 = new JFrame("Doctors Detail");
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.setSize(1000,600);
                    frame2.setLocationRelativeTo(null);
                    frame2.setResizable(false);
                    frame2.setLayout(null);
                    frame2.setVisible(true);
                }
                catch(Exception e){
                    System.out.println(e);
                }
        });

        JButton button3 = new JButton("Manage Store");
        button3.setBounds(400,250,200,30);
        frame.add(button3);
        button3.addActionListener(l -> {
            try{
                // Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                frame.dispose();
                JFrame frame3 = new JFrame("Manage Store");
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setSize(1000,600);
                frame3.setLocationRelativeTo(null);
                frame3.setResizable(false);
                frame3.setLayout(null);
                frame3.setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

        JButton button4 = new JButton("View Payment Status");
        button4.setBounds(400,300,200,30);
        frame.add(button4);
        button4.addActionListener(l -> {
            try{
                // Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                frame.dispose();
                JFrame frame4 = new JFrame("Manage Store");
                frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame4.setSize(1000,600);
                frame4.setLocationRelativeTo(null);
                frame4.setResizable(false);
                frame4.setLayout(null);
                frame4.setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}

