package myio.stream.bufferstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 缓冲字节流
 */
public class BufferByteStream {

    public static void bufferByteCopy() throws Exception {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("F:/IO/test4.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("F:/IO/bufferByteCopy.txt"));

        byte[] bytes = new byte[10];
        int length = 0;

        while ((length = bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,length);
        }
        bufferedOutputStream.flush();
        bufferedInputStream.close();
        bufferedInputStream.close();
    }

    public static void main(String[] args) throws Exception{
        bufferByteCopy();
    }

}
