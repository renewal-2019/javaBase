package myio.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 文件字节流
 */
public class ByteStream {

    /**
     * 文件字节输入流
     * 在读取文件时，必须保证该文件已存在，否则出异常
     * @throws Exception
     */
    public static void fileInputStream() throws Exception {
        FileInputStream inputStream = new FileInputStream("F:/IO/test2.txt");//拿取数据源
        byte[] bytes = new byte[10];//用一个字节数组来存储字节输入流的数据

        int index = 0;//设置一个读取长度的数据
        while ((index = inputStream.read(bytes))!=-1){//把输入流读取到字符串中
            String strs = new String(bytes,3,index);//把字节数组转换为字符串，从第几位开始读，读几位。
            System.out.println(strs);
        }

        inputStream.close();
    }

    /**
     * 文件字节输出流
     * 在写入一个文件时，如果目录下有同名文件将被覆盖
     */
    public static void fileOutputStream() throws Exception{

        FileOutputStream outputStream = new FileOutputStream("F:/IO/test3.txt");//指定输出路径
        String str = "空装强袭";//指定输出内容
        outputStream.write(str.getBytes());//通过字节，将数据放入输出流中
        outputStream.flush();//将输出流刷写到硬盘上
        outputStream.close();

    }

    /**
     * 同时使用输入输出流就可以实现文件的复制
     */
    public static void copyFile() throws Exception{

        FileInputStream inputStream = new FileInputStream("F:/IO/test3.txt");
        FileOutputStream outputStream = new FileOutputStream("F:/IO/copy.txt");

        byte[] bytes = new byte[20];
        int length = 0;

        while ((length = inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,length);
        }

        outputStream.flush();
        outputStream.close();
        inputStream.close();
    }

    public static void main(String[] args) throws Exception {
//        fileInputStream();
//        fileOutputStream();
        copyFile();
    }

}
