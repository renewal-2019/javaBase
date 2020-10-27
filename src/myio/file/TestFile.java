package myio.file;

import java.io.File;
import java.io.IOException;

/**
 * file的一些常用API
 */
public class TestFile {

    /**
     * 递归遍历所有文件
     * @param file
     */
    public void testFiles(File file){

        if(file.isFile()){
            System.out.println(file.getAbsoluteFile() + "是文件");
        }else{
            System.out.println(file.getAbsoluteFile() + "是目录");
            //获取当前目录对象的子文件及目录对象
            File[] files = file.listFiles();
            if(files != null && files.length > 0){
                for(File f : files){
                    testFiles(f);
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {

        File file = new File("F:/IO/test1.txt");//此文件/目录必须已经存在

        file.getPath();//获取文件路径

        file.renameTo(new File("F:/IO/test2.txt"));
        System.out.println(file.getName());//此时的file引用指向的还是原来的file对象
        File file2 = new File("F:/IO/test2.txt");
        System.out.println(file2.lastModified());
        System.out.println(file2.length());

        File f3 = new File("F:/IO/nb.txt");
        //如果文件不存在则创建文件
        if(!f3.exists()){
            f3.createNewFile();
        }
        f3.delete();

        File f4 = new File("F:/IO/a/b/c");
        f4.mkdir();//创建单层目录，如果多层则无法创建
        f4.mkdirs();

        File f5 = new File("F:/IO");
        String[] strs = f5.list();//返回当前目录下的文件和目录
        for(String str : strs){
            System.out.println(str);
        }

        File[] strs2 = f5.listFiles();//返回当前目录下的文件和目录
        for(File str : strs2){
            System.out.println(str);
        }

         new TestFile().testFiles(f5);

    }

}
