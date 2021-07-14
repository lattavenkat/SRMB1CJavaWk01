

public class RmiClient {
    public static void main (String [] args)
    {
        MyInterface f;

        try
        {
            f = (MyInterface)Naming.lookup ("//localhost:4200/MyInterface");

            f.randomData ();
            System.out.println (f.getData ());
            f.setData (50);
            System.out.println (f.getData ());
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }       
    }
}
