package myextend;

public class Test {

    public static void main(String[] args) {

        Person stu = new Stu();
        stu.ask();
        Person.ask();

        new Stu(){
            {
                super.name = "sl";
            }
        };

    }

}
