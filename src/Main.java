//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and Dhiman");
//    }
//}

public class Main {
    public void draw(){
        System.out.println("Drwaing circle with default color Black and  diameter 1 cm.");
    }
    public void draw(int diameter){
        System.out.println("Drwaing circle with default color Black and diameter"+diameter+" cm.");
    }
    public void draw(int diameter, String color){
        System.out.println("Drwaing circle with color"+color+" and diameter"+diameter+" cm.");
    }
    public static void main(String[] args) {
        Main c = new Main();
        c.draw(200, " RED");
    }
}

