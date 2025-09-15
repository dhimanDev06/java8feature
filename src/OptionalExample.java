import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        String[] names = new String[9];
       names[0]="Dhiman";
        Optional<String> ck = Optional.ofNullable(names[1]);
        System.out.println(ck.isEmpty());
        System.out.println(ck.isPresent());
        if (ck.isPresent()) {
            System.out.println("Word: " + ck.get().toLowerCase()+names.length);
        } else {
            System.out.println("Word is null");
        }

}
}