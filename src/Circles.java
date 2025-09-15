public class Circles extends ShapeAbs{
    double radious;
    public Circles(String color, double radious){
        super(color);
        this.radious = radious;
    }
    @Override
    double area(){
        double data =  Math.PI * Math.pow(this.radious, 2);
        return data;
    }

    @Override
    public String getData(){
        return "Area is "+ area()+" and color is "+super.color;
    }
}
