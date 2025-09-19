import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException {
    public static void main(String[] args){
        try {
            String path = "C:\\Users\\Dhiman\\OneDrive\\Desktop\\javaOnly\\sampleOne\\src\\Driver.java";
            FileReader fr = new FileReader(path);
            System.out.println("File opened successfully.");
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println("Show Data" + data);
            }
//            File file = new File(path);
//            System.out.println("Exists: " + file.exists());
//            System.out.println("Readable: " + file.canRead());
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException is "+e.getMessage());
        }catch (java.io.IOException e) {
            System.out.println("IOException is "+e.getMessage());
        }
    }
}



