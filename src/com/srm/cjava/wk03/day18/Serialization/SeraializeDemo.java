import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SeraializeDemo {
    public static void main(String[] args) {
        try {
            MyBank ob = new MyBank(82, "Axis");
            MyBank ob1 = new MyBank(92, "City");
            FileOutputStream fout = new FileOutputStream("serializee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(ob);
            out.writeObject(ob1);
            out.flush();
            out.close();
            System.out.println("Axis Bank Details:");
            System.out.println("IFSC CODE: " + ob.ifsc);
            System.out.println("EMPLOYEE NAME: " + ob.bankname);
            System.out.println("City Bank Details:");
            System.out.println("IFSC CODE: " + ob1.ifsc);
            System.out.println("EMPLOYEE NAME: " + ob1.bankname);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
