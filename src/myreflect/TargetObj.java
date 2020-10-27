package myreflect;

public class TargetObj {

    public String name;

    private int age = 18;

    public Boy boy = new Boy();

    public TargetObj(){
    }

    public TargetObj(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void publicMethod(String car){
        System.out.println("我有一辆" + car);
    }

    private void privateMethod(String money){
        System.out.println("我有" + money + "RMB");
    }

    public Boy getBoy() {
        return boy;
    }

    public void setBoy(Boy boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.boy.name);
        System.out.println(this.boy.age);
        System.out.println(this.boy.bb.dd);
        System.out.println(this.boy.bb.value);
        return super.toString();
    }
}

class Boy{
    String name;
    int age;
    BB bb = new BB();

    public BB getBb() {
        return bb;
    }

    public void setBb(BB bb) {
        this.bb = bb;
    }

    public Boy(){
        name = "zl";
        age = 22;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class BB{
    String value;
    int dd;

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
