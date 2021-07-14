import java.rmi.*;

public class RmiServer {
    public static void main (String [] args)
    {
        try
        {
            MyInterface f = new MyInterfaceImpl ();

            Naming.rebind ("//localhost:4200/MyInterface", f);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
}
