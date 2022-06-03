import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

public class RMI extends UnicastRemoteObject implements RMIInt {
    public RMI() throws RemoteException {
        super();
    }

    public int addNumber(int a, int b) throws RemoteException {
        return a + b;
    }
}

