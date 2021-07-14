import java.rmi.*;
public interface MyInterface extends Remote
{
    public void setData (int d) throws RemoteException;
    public int getData () throws RemoteException;
    public void randomData () throws RemoteException;
}
