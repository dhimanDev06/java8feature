public class Rectangles extends ShapeAbs{
    double length;
    double width;
    public Rectangles(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        double data = this.width * this.length;
        return data;
    }

    @Override
    public String getData() {
//        System.out.println("Dhiman getData");
        return "Area is "+ area()+" and color is "+super.color;
    }
}
