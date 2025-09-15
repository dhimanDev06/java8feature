public class Driver extends CarClass{
    String driverName;
    public Driver(String model,Integer num,String dName){
        super(model,num);
        this.driverName = dName;
    }
    public String show(){
        CarClass cc = new CarClass("Baleno",1234);
        String ss = "Car "+cc.model+" number is "+cc.number+" dname is "+this.driverName;
        return ss;
    }
}
