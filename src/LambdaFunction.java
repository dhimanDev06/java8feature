import java.util.Arrays;
import java.util.List;

public class LambdaFunction {
    static List<String> friends;
    public static void main(String[] args){
        friends = Arrays.asList("Dhiman","Suman");
        friends.forEach(name -> { // using lambda function
            System.out.println("Hello "+name);
            /*Functional Interfaces start*/
            GreetingFuncInterface gfi = (a) -> System.out.println("Hello gfi 1 "+a);
            gfi.show(name);
            /*Functional Interfaces end*/
        });

        for (int i = 0; i < friends.size(); i++) { // using old way
            System.out.println("Hello "+friends.get(i));
            /*Functional Interfaces start*/
            GreetingFuncInterface gfi = (name) -> System.out.println("Hello gfi 2 "+name);
            gfi.show(friends.get(i));
            /*Functional Interfaces end*/
        }
    }
}
