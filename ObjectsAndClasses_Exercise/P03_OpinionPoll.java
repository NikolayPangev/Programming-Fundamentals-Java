package ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_OpinionPoll {
    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return  this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();

        int num = Integer.parseInt(scanner.nextLine());
        for (int per = 1; per <= num; per++) {
            String data = scanner.nextLine();
            String name = data.split("\\s+")[0];
            int age = Integer.parseInt(data.split("\\s+")[1]);

            if (age > 30){
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }
        for (Person person :
                peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
