import java.rmi.*;

public interface RMIInt extends Remote {
    public int addNumber(int a, int b) throws RemoteException;
}
