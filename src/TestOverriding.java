public class TestOverriding {
    public static void main(String[] a){
        String c = "R";
        Shape sp = getShape(c);
        sp.draw();
        /*
        Shape sp = null;
        if (c == "R"){
            sp = new Rectangle();
        }else {
            sp = new Square();
        }
        sp.draw();
        */
    }
    public static Shape getShape(String c){
        Shape sp = null;
        if (c == "R"){
            sp = new Rectangle();
        }else {
            sp = new Square();
        }
        return  sp;
    }
}
