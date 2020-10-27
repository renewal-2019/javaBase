package myreflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FindObj {

    public static void main(String[] args) throws Exception {

        Class clazz = TargetObj.class;

        Class<?> clazz2 = Class.forName("myreflect.TargetObj");

        //获取类名
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        //获取类实例
        TargetObj targetObj = (TargetObj) clazz2.newInstance();

        //获取类中所有的方法
        Method[] methods = clazz2.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }

        //获取指定方法并调用
        Method method = clazz2.getMethod("publicMethod",String.class);
        method.invoke(targetObj,"AUDI A8");

        //获取所有属性名
        Field[] fields = clazz2.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }

        //获取指定属性
        Field field = clazz2.getDeclaredField("age");
        //对指定属性进行修改
        field.setAccessible(true);//对私有属性或方法进行修改或调用需要取消安全检查
        field.set(targetObj,18);
        System.out.println(field.get(targetObj));

    }

}
