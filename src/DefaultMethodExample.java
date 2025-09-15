public interface DefaultMethodExample {
    public void hello(String name);
    default void Show(){
        System.out.println("Hello Default Method");
    }
    static void StaticShow(){
        System.out.println("Hello static Method");
    }
}
