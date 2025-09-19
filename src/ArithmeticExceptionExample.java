public class ArithmeticExceptionExample {
    public static void main(String[] args){
        try {
            int a = 10/2;
        }catch (ArithmeticException e){
      System.out.println("Exception "+e.getMessage());
        }
    }
}