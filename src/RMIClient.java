import java.rmi.*;
// import java.rmi.server.*;
// import java.net.*;
// import java.io.*;

public class RMIClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 9999;
        String name = "RMIClient";
        String url = "rmi://" + host + ":" + port + "/" + name;
        try {
            RMIInt stub = (RMIInt) Naming.lookup(url);
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = stub.addNumber(a, b);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    }
}
