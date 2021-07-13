import java.io.Serializable;

public class MyBank implements Serializable {
    int ifsc;
    String bankname;

    public MyBank(int ifsc, String bankname) {
        this.ifsc = ifsc;
        this.bankname = bankname;
    }

    
}
