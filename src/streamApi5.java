import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamApi5 {
    public static void main(String[] args) {
        //Remove duplicates from a list while preserving the order using Java streams:

        List<Integer> list1 = Arrays.asList(2,5,7,8,3,5,4,9);

        List<Integer> list = list1.stream()
                .distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
