package myreflect;

import java.lang.reflect.Field;

public class CopyObject {

    public Object copy(Object obj) throws IllegalAccessException, InstantiationException {

        //获取目标类对象
        Class<?> tClass = obj.getClass();
        //创建类实体
        Object copyNew = tClass.newInstance();
        //获取所有属性
        Field[] fields = tClass.getDeclaredFields();

        for (Field field : fields) {
            Class classType = field.getType();
            if (classType.isPrimitive()
                    || classType.getPackage().getName().equals("java.lang")
                    || classType.getPackage().getName().equals("java.util")
            ) {
                //打开私有访问
                field.setAccessible(true);
                //获取属性值
                Object object = field.get(obj);
                //给新对象copy值
                field.set(copyNew, object);
            }else {
                //打开私有访问
                field.setAccessible(true);
                //获取属性值
                Object object = field.get(obj);
                //给新对象copy值
                field.set(copyNew,copy(object));
            }
        }

        return copyNew;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        TargetObj targetObj = new TargetObj();
        targetObj.setName("Dinky");
        targetObj.getBoy().setAge(66);
        targetObj.getBoy().setName("slZhang");
        targetObj.getBoy().getBb().setDd(88);
        targetObj.getBoy().getBb().setValue("hahahahha");

        CopyObject copyObject = new CopyObject();
        TargetObj copyResult = (TargetObj) copyObject.copy(targetObj);

        targetObj.getBoy().getBb().setValue("66666666666");

        copyResult.toString();
    }

}
