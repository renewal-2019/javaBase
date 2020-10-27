package myextend;

import java.util.HashMap;
import java.util.Map;

public class TestFather {

    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        father.doSomething(new HashMap());
        son.doSomething(new HashMap());
        Map map = new HashMap();
        son.doSomething(map);
    }
}
