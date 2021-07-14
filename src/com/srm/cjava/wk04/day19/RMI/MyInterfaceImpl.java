import java.rmi.*;
import java.rmi.server.*;

public class MyInterfaceImpl extends UnicastRemoteObject implements MyInterface {
    public MyInterfaceImpl () throws RemoteException
    {
        super(4220);
    }

    private int data;

    public void setData(int d) throws RemoteException {
        data = d;
    }

    public int getData() throws RemoteException {
        return data;
    }

    public void randomData() throws RemoteException {
        data = (int) (Math.random() * 1000);
    }
}