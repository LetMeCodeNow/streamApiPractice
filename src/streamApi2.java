import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamApi2 {
    public static void main(String[] args) {
        //Calculate the average age of a list of Person objects using Java streams

        List<Person> persons = Arrays.asList(
                new Person("Aman",27),
                new Person("Naman",26),
                new Person("Ram",25),
                new Person("Lakhan",28),
                new Person("Raja",29)
        );

        double avgAge = persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println(avgAge);

    }
}

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}