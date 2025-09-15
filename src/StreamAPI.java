import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args){
        List<Integer> listInt = Arrays.asList(45,6,5,7,8,9,4);
        List<Integer> nList = listInt.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());//.collect(Collectors.toUnmodifiableList());
        System.out.println("List"+nList);

        List<Integer> sList = listInt.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//.collect(Collectors.toUnmodifiableList());
        System.out.println("List "+sList);
    }
}
