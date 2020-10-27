package myio.stream.systeminstream;

import java.io.*;

/**
 * 标准输入输出流
 * 将键盘上键入的值，通过转换流进入，在转为缓冲字符流
 */
public class TestSystemInStream {

    /**
     * 把控制台输入的内容写到指定的文件中，当接收到字符串over，就结束程序的运行
     * System.in 的类型是InputStream
     */
    public static void testSystemIn() throws Exception{
        //创建转换输入流
        InputStreamReader in = new InputStreamReader(System.in);
        //使用缓冲流接受数据
        BufferedReader bufferedReader = new BufferedReader(in);
        //创建缓冲输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/IO/systemin.txt"));

        String line = "";

        while ((line = bufferedReader.readLine())!=null){
            if(line.equals("over")){
                break;
            }
            bufferedWriter.write(line);
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
        in.close();

    }

    public static void main(String[] args) throws Exception{
        testSystemIn();
    }
}
