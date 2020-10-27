package mystring;

public class MyString2 {

    public String joinString(String... str){
        return String.join(str[0],str[1],str[2],str[3]);//可以将指定分隔符加入到各个字符串中间
    }

    public static void main(String[] args) {
        System.out.println(new MyString2().joinString("/", "Z", "S", "L"));
    }
}
