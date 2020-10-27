package myio.stream.transferstream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 转换流：可以把字节流转换为字符流，当字节流中的数据都是字符的时候，使用转换流转为字符流处理效率更高
 *
 * 转换字节输入流为字符输入流
 * 注意，在转换字符流的时候，设置的字符集编码要与读取的文件的数据的编码一致
 * 不然就会出现乱码
 */
public class TestInputStreamReader {

    public static void testInputStreamReader() throws Exception{
        FileInputStream inputStream = new FileInputStream("F:/IO/copy.txt");

        //把字节流转换为字符流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");

        char[] chars = new char[10];
        int length = 0;
        while ((length = inputStreamReader.read(chars))!=-1) {
            System.out.println(new String(chars,0,length));
        }
    }

    public static void main(String[] args) throws Exception{
        testInputStreamReader();
    }

}
