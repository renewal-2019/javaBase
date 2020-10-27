package java8;

import java.util.HashMap;
import java.util.Map;

public class Test {

    static Map map = new HashMap<String,Integer>();

    int x = (int) map.get("niupi");//对象在初始化时已经确定了x的属性为null,不管后面map怎么变

    Integer i = (Integer) map.get("haha");//因为i是对象,有指向性,随着map的值的变化,在初始化后会发生变化

    public static void main(String[] args) {

        Test test = new Test();
        map.put("haha",0);
        System.out.println(new Test().i);

    }

}
