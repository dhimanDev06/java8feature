public class AbstractionTest {
    public static void main(String[] a){
        ShapeAbs a1 = new Rectangles("Blue",10,150);
        String retrunData = a1.getData();
        ShapeAbs a2 = new Circles("Blue",10);
        String retrunData1 = a2.getData();
        System.out.println(retrunData.toString());
        System.out.println(retrunData1.toString());
    }
}
