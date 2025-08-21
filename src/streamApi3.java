import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class streamApi3 {
    public static void main(String[] args) {
        //Check if a list of integers contains a prime number using Java stream

        List<Integer> list = Arrays.asList(12,11,1,2,5,43,3,22,55);

        list.stream()
                .filter(streamApi3::isPrime)
                .forEach(System.out::println);

      //  System.out.println("Prime numbers are: "+primes);
    }

    public static Boolean isPrime(int number){

        if(number <= 1) return false;
        if(number == 2) return true;
        if(number % 2==0) return false;

        for(int i=3;i<Math.sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;

    }
}
