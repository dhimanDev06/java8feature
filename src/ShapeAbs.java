abstract class ShapeAbs {
    String color;
    abstract double area();
    public abstract String getData();
    public ShapeAbs(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
}
