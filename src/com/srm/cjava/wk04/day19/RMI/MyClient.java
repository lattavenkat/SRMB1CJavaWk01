
    
import java.rmi.*;

public class MyClient {
    public static void main(String args[]) {
        try {
            MyInterface stub = (MyInterface) Naming.lookup("rmi://localhost:3000/rmidemo");
            
            System.out.println(stub.div(14, 8));
        } 
        catch (Exception e) {
        }
    }
}

