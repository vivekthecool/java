package utility;

import java.util.List;

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void getPersonList(List<Person> list) {
        list.add(new Person(1, "abc1"));
        list.add(new Person(2, "abc2"));
        list.add(new Person(3, "abc3"));

        list.add(new Person(6, "bcd1"));
        list.add(new Person(7, "bcd2"));
        list.add(new Person(8, "bcd3"));

        list.add(new Person(4, "abc4"));
        list.add(new Person(5, "abc5"));

        list.add(new Person(9, "bcd4"));
        list.add(new Person(10, "bcd5"));
    }
}
