import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class Appointment {
    Appointment(){
        JFrame frame = new JFrame("Appointment");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel label = new JLabel("Hospital Management System Appointment");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setBounds(300,50,500,30);
        frame.add(label);
        JLabel label1 = new JLabel("Patient Name");
        label1.setFont(new Font("Serif", Font.PLAIN, 18));
        label1.setBounds(250,120,100,30);
        frame.add(label1);
        JLabel label2 = new JLabel("Patient Age");
        label2.setFont(new Font("Serif", Font.PLAIN, 18));
        label2.setBounds(250,180,100,30);
        frame.add(label2);
        JLabel label3 = new JLabel("Patient Address");
        label3.setFont(new Font("Serif", Font.PLAIN, 18));
        label3.setBounds(250,240,100,30);
        frame.add(label3);
        JLabel label4 = new JLabel("Patient Phone");
        label4.setFont(new Font("Serif", Font.PLAIN, 18));
        label4.setBounds(250,300,150,30);
        frame.add(label4);
        JLabel label5 = new JLabel("Patient Email");
        label5.setFont(new Font("Serif", Font.PLAIN, 18));
        label5.setBounds(250,360,100,30);
        frame.add(label5);
        JTextField text1 = new JTextField();
        text1.setBounds(400,120,200,30);
        frame.add(text1);
        JTextField text2 = new JTextField();
        text2.setBounds(400,180,200,30);
        frame.add(text2);
        JTextField text3 = new JTextField();
        text3.setBounds(400,240,200,30);
        frame.add(text3);
        JTextField text4 = new JTextField();
        text4.setBounds(400,300,200,30);
        frame.add(text4);
        JTextField text5 = new JTextField();
        text5.setBounds(400,360,200,30);
        frame.add(text5);
        JButton button = new JButton("Submit");
        button.setBounds(400,420,100,30);
        frame.add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = text1.getText();
                String age = text2.getText();
                String address = text3.getText();
                String phone = text4.getText();
                String email = text5.getText();
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                    Statement stmt = con.createStatement();
                    String query = "insert into patient values('"+name+"','"+age+"','"+address+"')";
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Data Inserted");
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }

    public static void main(String [] args) {
        new Appointment();
    }
}
