import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args){
        List<String> nms = Arrays.asList("Dhiman","Suman","Dhiman","Susmita");
        List<String> dis = nms.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique "+dis);
        Map<String,Long> dilst = nms.stream().collect(Collectors.groupingBy(n -> n,Collectors.counting()));
        System.out.println("dilst "+dilst);

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = num.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum "+sum);

        List<Integer> num1 = Arrays.asList(1,2,3);
        int mul = num1.stream().reduce(1,(a,b)->a*b);
        System.out.println("mul "+mul);

        int total = num.stream().collect(Collectors.reducing(0,Integer::sum));
        System.out.println("total "+total);


    }
}
