import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class Login {
    Login(){
        JFrame frame = new JFrame("Login");
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
        JLabel label1 = new JLabel("Username");
        label1.setFont(new Font("Serif", Font.PLAIN, 18));
        label1.setBounds(250,120,100,30);
        frame.add(label1);
        JLabel label2 = new JLabel("Password");
        label2.setFont(new Font("Serif", Font.PLAIN, 18));
        label2.setBounds(250,180,100,30);
        frame.add(label2);
        JTextField text1 = new JTextField();
        text1.setBounds(400,120,200,30);
        frame.add(text1);
        JPasswordField text2 = new JPasswordField();
        text2.setBounds(400,180,200,30);
        frame.add(text2);
        JButton button = new JButton("Login");
        button.setBounds(300,250,100,30);
        frame.add(button);
        JButton button1 = new JButton("Sign Up");
        button1.setBounds(450,250,100,30);
        frame.add(button1);
        button1.addActionListener(l->{
            frame.dispose();
            new SignUp();
        });
        button.addActionListener(l -> {
            frame.dispose();
            new Appointment();
        });
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String username = text1.getText();
                String password = text2.getText();
                if(username.equals("") || password.equals("")){
                    JOptionPane.showMessageDialog(null,"Please fill all the fields");
                }
                else{
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("select * from login where username='"+username+"' and password='"+password+"'");
                        if(rs.next()){
                            JOptionPane.showMessageDialog(null,"Login Successful");
                            frame.dispose();
                            new Main();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                }
            }
        });
    }

    public static void main(String [] args) {
        new Login();
    }

}
