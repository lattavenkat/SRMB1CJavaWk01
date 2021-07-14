

public class ReflectionClass {
    private String str; 
    public ReflectionClass()  {
          str = "Reflection"; 
        } 

    public void method1()  { 
        System.out.println("The string  is " + str); 
    }  
    public void method2(int n)  { 
        System.out.println("The number is " + n); 
    } 

    private void privatemethod() { 
        System.out.println("Private method is triggered"); 
    } 
}
