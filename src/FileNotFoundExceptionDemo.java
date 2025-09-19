import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args){
        try {
            String path = "C:\\Users\\Dhiman\\OneDrive\\Desktop\\javaOnly\\sampleOne\\src\\SayHelloa.java";
            FileReader fr = new FileReader(path);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException found: " + e.getMessage());
        }
    }
}
