package myextend;

import java.util.Collection;
import java.util.HashMap;

public class TestOverWrite extends Fathers{

    public void test(int i,String str){

    }

    public void test(String str,int i){

    }

//    public HashMap testOver(HashMap map) {
//        return map;
//    }
    //只改变重写方法的返回值类型直接编译不通过

    public static void main(String[] args) {
        new TestOverWrite().test(1,"as");
        new TestOverWrite().test("as",1);
    }

}

class Fathers{
    public Collection testOver(HashMap map){
        return (Collection) map;
    }
}
