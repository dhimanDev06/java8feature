import java.lang.reflect.InvocationTargetException;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> dyCls =  Class.forName("SayHello");
            Object obj = dyCls.getDeclaredConstructor().newInstance();
            dyCls.getMethod("hello",Integer.class).invoke(obj,99);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
