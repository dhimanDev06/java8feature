public class DefaultMethodImplement implements DefaultMethodExample{

    public void hello(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args){
        DefaultMethodImplement dmi = new DefaultMethodImplement();
        dmi.hello("Dhiman");
        // Calling Default method using interface name
        dmi.Show();
        // Calling static method using interface name
        DefaultMethodExample.StaticShow();
    }
}
