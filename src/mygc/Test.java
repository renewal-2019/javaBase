package mygc;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws Exception {
        Map map = new HashMap<>();
        Person p = new Person();
        map.put(1, p);
        p = null;

        Thread.sleep(1000);
        System.out.println(map.get(1));//堆中的对象new Person（）没有被回收

    }

}

class Person {

}