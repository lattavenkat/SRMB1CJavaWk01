import java.rmi.*;

public interface MyInterface extends Remote {
    public String div(int a, int b) throws RemoteException;
}