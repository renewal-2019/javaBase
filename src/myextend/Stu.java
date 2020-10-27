package myextend;

public class Stu extends Person {
    String name;

    Stu(){
        super("hah ",9);//如果父类没有无参构造，子类必须显示调用父类的有参构造,否则编译错误
        System.out.println("子类的构造方法");
    }

    @Override
    public void ask(int age) {
        System.out.println("子类方法");
    }
}
