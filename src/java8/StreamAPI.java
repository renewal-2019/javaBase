package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("jams","ha","jake","kobe");

        List<String> lists = strings.stream()//转化成流
                .filter(s -> s.startsWith("j"))//过滤出首字母为j的字符串
                .map(String::toUpperCase)//转换成大写
                .sorted()//对list排序
                .collect(Collectors.toList());

        System.out.println(lists);

        String[] array = {"ss","aa"};
        Stream.of(array).filter(s -> s.startsWith("j"));//数组转换为流的方式

        try (Stream<String> stringStream = Files.lines(Paths.get("file.txt"))) {//将文件中的元素转换为流
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
