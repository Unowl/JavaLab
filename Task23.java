import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task23 {
    private static <T, K> Map<K, List<T>> SwapKeysValues(Map<T, K> map){
        Map<K, List<T>> newMap = new HashMap<>();
        for (T key : map.keySet()) {
            newMap.putIfAbsent(map.get(key), new ArrayList<T>());
            newMap.get(map.get(key)).add(key);
        }
        return newMap;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> M = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 3);
            put(3, 1);
            put(4, 1);
        }};
        System.out.println(SwapKeysValues(M));
    }
}
