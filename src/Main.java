import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Person_1", "aa aa aa aa", 12));
        list.add(new Person("Person_2", "bb bb bb bb bb bb", 10));
        list.add(new Person("Person_3", "cc cc cc cc", 13));
        list.add(new Person("Person_4", "dd dd dd", 13));


        list.sort((p1, p2) -> {
            if ((p2.getSurname().split(" ").length > 2) & (p1.getSurname().split(" ").length > 2)) {
                return p2.getAge() - p1.getAge();
            } else {
                return p2.getSurname().split(" ").length - p1.getSurname().split(" ").length;
            }
        });
        System.out.println(list);
    }
}
