import java.rmi.*;

public class RMIServer {
    public static void main(String[] args) {
        try{
            RMI obj = new RMI();
            Naming.rebind("rmi://localhost:9999/RMIServer", obj);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
