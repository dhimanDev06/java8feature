public class CustomCheckedExceptionExample {
    public static void main(String[] args){
        try {
            checkValidation("12345678");
        } catch (CustomExcp e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkValidation(String arg) throws CustomExcp{
        if(arg.trim().length() < 5){
            throw new CustomExcp("Custom error");
        }
    }
}

class CustomExcp extends Exception{ // Custom Checked Exception
    public CustomExcp(String msg){
        super(msg);
    }
}