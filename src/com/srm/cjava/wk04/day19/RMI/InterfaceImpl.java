
import java.rmi.*;
import java.rmi.server.*;

public class InterfaceImpl extends UnicastRemoteObject implements MyInterface {
    InterfaceImpl() throws RemoteException {
        super();
    }
    public String div(int a, int b) {
        return "DIVIDE: " + (a * b);
    }
}