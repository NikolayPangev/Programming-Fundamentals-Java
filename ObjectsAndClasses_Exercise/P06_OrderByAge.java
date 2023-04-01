package ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P06_OrderByAge {
    public static class Person {
        private String name;
        private String id;
        private int age;

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peolpeList = new ArrayList<>();
        String data = scanner.nextLine();
        while (!data.equals("End")) {
            String name = data.split("\\s+")[0];
            String id = data.split("\\s+")[1];
            int age = Integer.parseInt(data.split("\\s+")[2]);

            Person person = new Person(name, id, age);
            peolpeList.add(person);

            data = scanner.nextLine();
        }

        peolpeList.sort(Comparator.comparing(Person::getAge));

        for (Person person : peolpeList) {
            System.out.println(person.getName() + " with ID: " + person.getId() + " is " + person.getAge() + " years old.");
        }
    }
}
