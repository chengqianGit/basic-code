package Demo01;

import java.util.ArrayList;

/*
并发流：
    当流中的元素非常多时，挨个处理比较复杂
    同时处理，就是并发

如何获取并发流：
    .parallelStream()
注意事项：
    1.到底几个流在操作，系统进行处理

 */
public class demo02StreamParallel {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add("hello-"+i);
        }
        // 只有一个流在处理
        list.stream().forEach(System.out::println);

        // 获取并发流
        list.parallelStream().forEach(System.out::println);

        // 从普通流升级到并发流
        list.stream().parallel().forEach(System.out::println);
    }
}
