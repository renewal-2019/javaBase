package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterPredicate {

    public static void main(String[] args) {
        Person p1 = new Person(12, "M", "jake");
        Person p2 = new Person(22, "M", "son");
        Person p3 = new Person(32, "F", "rose");
        Person p4 = new Person(42, "F", "follow");
        Person p5 = new Person(52, "M", "tom");

        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);

//        List<Person> personList1 = personList.stream()
//                .filter(e -> e.getAge() > 30 && e.getGender().equals("M"))
//                .collect(Collectors.toList());

        List<Person> personList2 = personList.stream()
                .filter(
                        Person.ageGreaterThan30
                        .and(Person.genderM)
                        .negate()//取反
                )
                .collect(Collectors.toList());

        System.out.println(personList2);
    }

}

class Person {

    public static Predicate<Person> ageGreaterThan30 = x -> x.getAge() > 30;

    public static Predicate<Person> genderM = x -> x.getGender().equals("M");

    public Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    private int age;
    private String gender;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
