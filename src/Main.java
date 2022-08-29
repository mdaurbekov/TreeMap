import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Person_1", "aa aa aa aa", 12));
        list.add(new Person("Person_2", "bb bb bb bb bb bb", 20));
        list.add(new Person("Person_3", "cc cc cc cc", 13));
        list.add(new Person("Person_4", "dd dd", 23));


        list.removeIf(person -> person.getAge() < 18);
        System.out.println(list);
    }
}
