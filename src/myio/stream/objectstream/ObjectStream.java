package myio.stream.objectstream;

import java.io.*;

/**
 * 对象流即对象的序列化与反序列化,
 * 被序列化的类一定要实现Serializable接口，才不会报错
 * 注意：对象的序列化与反序列化使用的类要严格一致，包名，类名，类机构等等所有都要一致
 */
public class ObjectStream {

    /**
     * 对象的序列化
     *
     * @throws Exception
     */
    public static void serialize() throws Exception {

        ObjectOutputStream obOut = new ObjectOutputStream(new FileOutputStream("F:/IO/object.txt"));

        Person p = new Person();
        p.name = "元祖";
        p.age = 500;

        obOut.writeObject(p);
        obOut.flush();
        obOut.close();

    }

    public static void deserialize() throws Exception {
        ObjectInputStream obIn = new ObjectInputStream(new FileInputStream("F:/IO/object.txt"));

        Object ob = obIn.readObject();
        Person p = (Person) ob;
        System.out.println(p.name);
        obIn.close();

    }

    public static void main(String[] args) throws Exception {
//        serialize();
        deserialize();
    }

}

class Person implements Serializable {
    String name;
    int age;
}
