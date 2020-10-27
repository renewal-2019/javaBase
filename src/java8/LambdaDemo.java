package java8;

import java.util.function.Consumer;

/**
 * lambda用来实现匿名接口
 */

public class LambdaDemo {

    @FunctionalInterface
    interface Printer{
        void printer(String str);
    }

    public void printSomething(String str, Printer printer){
        printer.printer(str);
    }

    public void printSS(String str, Consumer consumer){
        consumer.accept(str);
    }

    public void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        String str = "hahahaah";
//        Printer printer = new Printer() {
//            @Override
//            public void printer(String str) {
//                System.out.println(str);
//            }
//        };

//        Printer printer = (String val) -> {//小括号写参数,大括号写方法实现
//            System.out.println(val);
//        };

//        Printer printer = (val) -> {//简化:参数类型可省略
//            System.out.println(val);
//        };

//        Printer printer = val -> {//简化:只有一个参数时可以把括号去掉
//            System.out.println(val);
//        };

//        Printer printer = val -> System.out.println(val);//简化:函数体只有一行,则大括号可省略

        //最终简化
        lambdaDemo.printSomething(str,val -> System.out.println(val));
        lambdaDemo.printSomething(str,lambdaDemo::print);//使用对象的方法
        lambdaDemo.printSS(str,val -> System.out.println(val));
    }

}
