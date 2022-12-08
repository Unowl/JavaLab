import java.util.*;

public class Task25 {
    public static void Fun() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        List<String> list = Arrays.asList(line.toLowerCase().split("[^0-9a-zа-я]"));
        list.stream().filter(x -> !x.equals("")).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int cmp = (int) (list.stream().filter(x -> x.equals(o2)).count() - list.stream().filter(x -> x.equals(o1)).count());
                if (cmp != 0) return cmp;
                return o1.compareTo(o2);
            }
        }).distinct().limit(10).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Fun();
    }
}
/*
Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
Sed sodales consectetur purus at faucibus. 
Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. 
Morbi lacinia velit blandit tincidunt efficitur. 
Vestibulum eget metus imperdiet sapien laoreet faucibus. 
Nunc eget vehicula mauris, ac auctor lorem. 
Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
Integer vel odio nec mi tempor dignissim.
----
consectetur
faucibus
ipsum
lorem
adipiscing
amet
dolor
eget
elit
mi
*/