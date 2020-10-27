package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap1 {

    public static void main(String[] args){
        Person p1 = new Person(12, "M", "jake");
        Person p2 = new Person(22, "M", "son");
        Person p3 = new Person(32, "F", "rose");
        Person p4 = new Person(42, "F", "follow");
        Person p5 = new Person(52, "M", "tom");

        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);

        List<Person> personList2 = personList.stream()
                .peek(e->{//当处理后的返回结果与参数类型相同时,可以用peek来替代map
                    e.setAge(e.getAge()+1);
                    e.setGender(e.getGender().equals("M")?"male":"female");
                }).collect(Collectors.toList());

        System.out.println(personList2);

    }

}
