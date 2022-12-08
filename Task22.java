import java.util.List;
import java.util.Map;
import java.util.HashMap;
import  java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Task22 {
    
    public static <T> Map<T, Integer> countValues(T[] ts) {
        Map<T, Integer> map = new HashMap<>();
        for (T t : ts) {
            map.compute(t, new BiFunction<T, Integer, Integer>() {
                @Override
                public Integer apply(T t, Integer count) {
                    return count == null ? 1 : count + 1;
                }
            });
        }

        return map;
    }

    public static void main(String[] args) {
        String[] a = {"1", "2", "3", "2", "3", "3"};
        System.out.println(countValues(a));
    }
}
