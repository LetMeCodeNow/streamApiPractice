import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class streamApiEx1 {

    public static void main(String[] args) {
        //find the longest string in list of strings

        List<String> list = Arrays.asList("Ram", "Shyam", "Sita", "GeetaJi");

        Optional<String> s = list.stream()
                .max(Comparator.comparingInt(String::length));

        s.ifPresent(System.out::println);
              //  System.out.println("Longest String is: "+s);
    }
}
