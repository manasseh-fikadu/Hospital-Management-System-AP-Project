import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
// import java.sql.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class Doctor {
    Doctor(){
        JFrame frame = new JFrame("Doctor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel label = new JLabel("Hospital Management System Doctor");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setBounds(300,50,500,30);
        frame.add(label);
        JButton button = new JButton("List of Patients");
        button.setBounds(400,120,200,30);
        frame.add(button);
        button.addActionListener(l -> {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                JFrame frame1 = new JFrame("Patient List");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
                JLabel label1 = new JLabel("Patient List");
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
                JLabel label4 = new JLabel("Patient Age");
                label4.setFont(new Font("Serif", Font.PLAIN, 18));
                label4.setBounds(250,240,100,30);
                frame1.add(label4);
                JLabel label5 = new JLabel("Patient Address");
                label5.setFont(new Font("Serif", Font.PLAIN, 18));
                label5.setBounds(250,300,100,30);
                frame1.add(label5);
                JLabel label6 = new JLabel("Patient Phone");
                label6.setFont(new Font("Serif", Font.PLAIN, 18));
                label6.setBounds(250,360,100,30);
                frame1.add(label6);
                JLabel label7 = new JLabel("Patient Email");
                label7.setFont(new Font("Serif", Font.PLAIN, 18));
                label7.setBounds(250,420,100,30);
                frame1.add(label7);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

        JButton button1 = new JButton("Examination");
        button1.setBounds(400,200,200,30);
        frame.add(button1);
        button1.addActionListener(l -> {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                JFrame frame1 = new JFrame("Examination");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
                JLabel label1 = new JLabel("Examination");
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
                JLabel label4 = new JLabel("Patient Age");
                label4.setFont(new Font("Serif", Font.PLAIN, 18));
                label4.setBounds(250,240,100,30);
                frame1.add(label4);
                JLabel label5 = new JLabel("Examination Result");
                label5.setFont(new Font("Serif", Font.PLAIN, 18));
                label5.setBounds(250,300,100,30);
                frame1.add(label5);
                JButton button2 = new JButton("Send to Lab for Examination");
                button2.setBounds(400,300,200,30);
                frame1.add(button2);
                button2.addActionListener(l1 -> {
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        // Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                        // Statement stmt1 = con1.createStatement();
                        // ResultSet rs1 = stmt1.executeQuery("select * from patient");
                        JFrame frame2 = new JFrame("Send to Lab for Examination");
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.setSize(1000,600);
                        frame2.setLocationRelativeTo(null);
                        frame2.setResizable(false);
                        frame2.setLayout(null);
                        frame2.setVisible(true);
                        JLabel label11 = new JLabel("Send to Lab for Examination");
                        label11.setFont(new Font("Serif", Font.BOLD, 24));
                        label11.setBounds(300,50,500,30);
                        frame2.add(label11);
                        JLabel label21 = new JLabel("Patient ID");
                        label21.setFont(new Font("Serif", Font.PLAIN, 18));
                        label21.setBounds(250,120,100,30);
                        frame2.add(label21);
                        JLabel label31 = new JLabel("Patient Name");
                        label31.setFont(new Font("Serif", Font.PLAIN, 18));
                        label31.setBounds(250,180,100,30);
                        frame2.add(label31);
                        JLabel label41 = new JLabel("Patient Age");
                        label41.setFont(new Font("Serif", Font.PLAIN, 18));
                        label41.setBounds(250,240,100,30);
                        frame2.add(label41);
                        JLabel label51 = new JLabel("Patient Address");
                        label51.setFont(new Font("Serif", Font.PLAIN, 18));
                        label51.setBounds(250,300,100,30);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                });
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

        JButton button2 = new JButton("Technician Report");
        button2.setBounds(400,250,200,30);
        frame.add(button2);
        button2.addActionListener(l -> {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                JFrame frame1 = new JFrame("Technician Report");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
                JLabel label1 = new JLabel("Technician Report");
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
                JLabel label4 = new JLabel("Patient Age");
                label4.setFont(new Font("Serif", Font.PLAIN, 18));
                label4.setBounds(250,240,100,30);
                frame1.add(label4);
                JLabel label5 = new JLabel("Patient Address");
                label5.setFont(new Font("Serif", Font.PLAIN, 18));
                label5.setBounds(250,300,100,30);
                frame1.add(label5);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

        JButton button3 = new JButton("Recommend Medicine");
        button3.setBounds(400,300,200,30);
        frame.add(button3);
        button3.addActionListener(l -> {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from patient");
                JFrame frame1 = new JFrame("Recommend Medicine");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1000,600);
                frame1.setLocationRelativeTo(null);
                frame1.setResizable(false);
                frame1.setLayout(null);
                frame1.setVisible(true);
                JLabel label1 = new JLabel("Recommend Medicine");
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
                JLabel label4 = new JLabel("Patient Age");
                label4.setFont(new Font("Serif", Font.PLAIN, 18));
                label4.setBounds(250,240,100,30);
                frame1.add(label4);
                JLabel label5 = new JLabel("Patient Address");
                label5.setFont(new Font("Serif", Font.PLAIN, 18));
                label5.setBounds(250,300,100,30);
                frame1.add(label5);
            }
            catch(Exception e){
                System.out.println(e);
            }
        });
    }

    public static void main(String[] args) {
        new Doctor();
    }
}
