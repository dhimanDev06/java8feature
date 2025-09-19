public class IllegalArgumentExceptionExample {
    public static void main(String[] args){
        try {
            checkNum(100);
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentExceptionExample "+e.getMessage());
        }
    }

    public static void checkNum(int num){
        if(num < 18){
            System.out.println("OK");
        }else {
            throw new IllegalArgumentException("Error");
        }
    }
}
