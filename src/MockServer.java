import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.net.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class MockServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("Connected to server");
            // socket.close();
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: localhost");
            System.exit(1);
        }
        System.out.println("Connection established");
        try {
            Socket socket = serverSocket.accept();
            System.out.println("Connection established");
            socket.close();
        } catch (IOException e) {
            System.err.println("Couldn't close socket");
            System.exit(1);
        }
    }
}
