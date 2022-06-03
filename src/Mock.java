import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import java.net.*;
// import java.util.*;
// import java.io.*;
// import java.net.*;

public class Mock {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 9999);
            System.out.println("Connected to server");
            // socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: localhost");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: localhost");
            System.exit(1);
        }
        System.out.println("Connection established");
    }
}
