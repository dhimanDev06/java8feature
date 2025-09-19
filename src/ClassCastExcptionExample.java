import java.util.ArrayList;
import java.util.List;

public class ClassCastExcptionExample {
    public static void main(String[] args) {
        try {
            Object obj = "Dhiman";
            Double num = (Double) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException " + e.getMessage());
        }


        try {
            int in = Integer.parseInt("Dhiman");
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException " + e.getMessage());
        }
        /*
        try {
            List<String> list = new ArrayList<>();
            while (true) {
                list.add("Memory consuming string");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught: " + e.getMessage());
        }*/

        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: " + e.getMessage());
        }
    }
    public static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }
}
