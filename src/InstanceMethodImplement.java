interface Sayable{
    void say();
}
class MethodRefDemo {
    public static void saySomething() {
        System.out.println("Hello, this is a static method.");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodRefDemo::saySomething;
        sayable.say();
    }
}
class Message {
    void printMessage() {
        System.out.println("Hello from instance method!");
    }
}

public class InstanceMethodImplement {
    public static void main(String[] args){
        Message msg = new Message();
        msg.printMessage();
        Sayable sayable = msg::printMessage;
        sayable.say();
    }
}
