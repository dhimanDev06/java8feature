public class CustomRuntimeException {
    public static void main(String[] args){
        try {
            checkNull("11ull");
        }catch (checkRunTimeException e){
            System.out.println(e.getMessage());
        } catch (CustomExcep e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkNull(String arg) throws CustomExcep {
        if(arg == null){
            throw new checkRunTimeException("Its a run time error");
        }else {
           checkValidation(arg);
        }
    }

    public static void checkValidation(String arg) throws CustomExcep {
        if (arg.length() > 8){
            throw new CustomExcep("Its too long");
        }
    }

}
class checkRunTimeException extends RuntimeException{
    public checkRunTimeException(String msg){
        super(msg);
    }
}
class CustomExcep extends Exception{ // Custom Checked Exception
    public CustomExcep(String msg){
        super(msg);
    }
}
