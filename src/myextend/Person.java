package myextend;

public class Person {

    String name;

    int age;

//    Person(){
//        System.out.println("父类构造函数");
//    }

    Person(String name,int age){
        System.out.println("父类有参构造");
    }

    public static void ask(){
        System.out.println("who");
    }

    public void ask(int age){
        System.out.println(age);
    }
//
//    private void work(){}

}
