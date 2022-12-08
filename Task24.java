import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String country;

    public User(Integer id, String firstName, String lastName, Integer age, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    public String toString() {
        return id.toString() + " " + firstName + " " + lastName + " " + age.toString() + " " + country;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}

public class Task24 {
    public static void testUser() {
        List<User> users = new LinkedList<>();
        users.add(new User(1, "Dori", "Frog", 18, "d"));
        users.add(new User(2, "Andrey", "Ginne", 30, "c"));
        users.add(new User(3, "Bady", "Rest", 42, "a"));
        users.add(new User(4, "Cin", "Abby", 18, "a"));
        users.add(new User(5, "Din", "Ver", 15, "b"));
        users.add(new User(6, "Ella", "Ast", 23, "c"));

        System.out.println("ex1");
        users.stream().sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }).forEach(System.out::println);
        System.out.println("-----------------");
        
        System.out.println("ex2");
        users.stream().sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        }).forEach(System.out::println);
        System.out.println("-----------------");
        
        System.out.println("ex3");
        System.out.println(users.stream().allMatch(x -> x.getAge() > 7));
        System.out.println("-----------------");
        
        System.out.println("ex4");
        System.out.println(users.stream().mapToInt(User::getAge).average().orElse(0));
        System.out.println("-----------------");
        
        System.out.println("ex5");
        users.stream().map(User::getCountry).distinct().forEach(System.out::println);
    }
    public static void main(String[] args) {
        testUser();
    }
}
