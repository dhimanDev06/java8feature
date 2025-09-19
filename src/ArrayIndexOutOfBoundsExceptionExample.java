public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args){
        int[] in = {15,3,5,4};
        try {
            int a = in[9];
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
