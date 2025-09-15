public class Transport {
    public static void main(String[] args){
        Driver obj = new Driver("Ingnis",6966,"Baban");
        String dataRen = "Car "+obj.model+" number is "+obj.number+" driver name is "+obj.driverName;
        System.out.println(dataRen);
        System.out.println(obj.show());
    }
}
