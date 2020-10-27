package innerclass;

public class Test {

    public class Person extends Stu implements Animal{

    }

    public interface Animal{

    }

    static class Stu{}

}

class God{

    public void tryS(int i){
        Test.Stu stu = new Test.Stu();//如果static不是静态的，则无法new出来
    }


    public static void main(String[] args){

    }

}