public class NullPointerExceptionExample {
    public static void main(String[] args){
        try {
            String a = null;
            a.trim();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println("Exception "+e.getMessage());
        }
    }
}
