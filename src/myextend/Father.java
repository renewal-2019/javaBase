package myextend;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Father {
    public Collection doSomething(HashMap map){
        System.out.println("父类被执行");
        return map.values();
    }
}

class Son extends Father{

    public Collection doSomething(Map map){//输入参数大于父类,是重载
        System.out.println("子类被执行");
        return map.values();
    }
}
