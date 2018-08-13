package Demo01;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
Stream流的使用
    要用到lambda表达式
    java8开始使用，JDK提供了一个流接口：java.util.stream.Stream<T>
如何获取流：
    1.根据集合获取流
    2.根据数组获取流,数组当中的元素必须是引用类型
 */
public class demo01 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("li,98");
        studentList.add("wang,90");
        studentList.add("chen,87");
        //stream流的方法
        studentList.stream().map(s -> s.split(",")[1]).map(Integer::parseInt).filter(n -> n > 90).forEach(System.out::println);
        // 1.根据集合获取一个流
        Stream<String> streamA = studentList.stream();

        // 2.根据数组获取流
        String[] str = {"hello","world","java"};
        Stream<String> streamB = Stream.of(str);
        Integer[] inte = new Integer[3];
        inte[0] = 1;
        inte[1]=2;
        inte[2] = 3;
        Stream<Integer> streamC = Stream.of(inte);


    }
}
