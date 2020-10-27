package myio.stream;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 文件字符流
 */
public class CharStream {

    /**
     * 文件字符流
     * 在读取文件时，必须保证该文件已存在，否则出异常
     */
    public static void fileReader() throws Exception{

        FileReader reader = new FileReader("F:/IO/test2.txt");
        char[] chars = new char[5];
        int length = 0;
        while ((length = reader.read(chars))!=-1){
            System.out.println(new String(chars,0,length));
        }

        reader.close();

    }

    /**
     * 文件字符输出流
     */
    public static void fileWriter() throws Exception{

        FileWriter writer = new FileWriter("F:/IO/test4.txt");
        String str = "沙扎比";
        writer.write(str);
        writer.flush();
        writer.close();

    }

    /**
     * 通过字符流实现文件拷贝
     */
    public static void copy() throws Exception{
        FileReader reader = new FileReader("F:/IO/test4.txt");
        FileWriter writer = new FileWriter("F:/IO/charCopy.txt");

        char[] chars = new char[10];
        int length = 0;
        while ((length = reader.read(chars))!=-1){
            writer.write(chars,0,length);
        }
        writer.flush();
        writer.close();
        reader.close();
    }

    public static void main(String[] args) throws Exception{

//        fileReader();
//        fileWriter();
        copy();

    }
}
