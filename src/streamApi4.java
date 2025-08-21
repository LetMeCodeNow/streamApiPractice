import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi4 {
    public static void main(String[] args) {
        //Merge two sorted lists into a single sorted list using Java streams

        List<Integer> list1 = Arrays.asList(2,5,7,8,3,4,9);
        List<Integer> list2 = Arrays.asList(12,14,51,21,77);

        Collections.sort(list1);
        Collections.sort(list2);

        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(mergedList);
    }
}
