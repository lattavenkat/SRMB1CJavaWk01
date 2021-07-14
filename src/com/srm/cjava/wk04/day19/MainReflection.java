import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class MainReflection {
    public static void main(String[] args) throws Exception {
        ReflectionClass obj = new ReflectionClass();
        Class clsobj = obj.getClass();
        System.out.println("Class Name :  " + clsobj.getName());

        Constructor cons = clsobj.getConstructor();
        System.out.println("Constructor Name :  " + cons.getName());

        System.out.println("The methods declared inside the class are : ");

        Method[] methods = clsobj.getDeclaredMethods();

        for (Method method : methods)
            System.out.println(method.getName());

        System.out.println("The public methods in the class are : ");

        Method[] pubmeth = clsobj.getMethods();

        for (Method method : pubmeth)
            System.out.println(method.getName());

        Method methodcall4 = clsobj.getDeclaredMethod("method2", int.class);
        methodcall4.invoke(obj, 5);

        Field field = clsobj.getDeclaredField("str");
        field.setAccessible(true);

        field.set(obj, "Hello");
        Method methodcall1 = clsobj.getDeclaredMethod("method1");

        methodcall1.invoke(obj);

        Method methodcall3 = clsobj.getDeclaredMethod("privatemethod");

        methodcall3.setAccessible(true);

        methodcall3.invoke(obj);

        Method methodcall2 = clsobj.getDeclaredMethod("method 2", double.class);
        methodcall2.invoke(obj, 25);

    }
}
