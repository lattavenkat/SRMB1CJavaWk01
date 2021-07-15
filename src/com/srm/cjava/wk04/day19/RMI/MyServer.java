
import java.rmi.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            MyInterface stub = new InterfaceImpl();
            Naming.rebind("rmi://localhost:3000/rmidemo", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
