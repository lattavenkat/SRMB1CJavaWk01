import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        try{  
       
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("serializee.txt"));  
            MyBank b=(MyBank)in.readObject();  
            MyBank b1=(MyBank)in.readObject(); 
            System.out.println("Serialized Objects: ");
            System.out.println(b.ifsc+" "+b.bankname);  
            System.out.println(b1.ifsc+" "+b1.bankname);  
            //closing the stream  
            in.close();  
            }
            catch(Exception e){System.out.println(e); 
           }  
    }
}
