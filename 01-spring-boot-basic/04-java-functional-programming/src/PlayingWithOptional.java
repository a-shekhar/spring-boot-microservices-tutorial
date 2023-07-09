import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("banana", "mango", "apple");


        Predicate<? super String> predicate = fruit -> fruit.startsWith("f");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
    }
}
