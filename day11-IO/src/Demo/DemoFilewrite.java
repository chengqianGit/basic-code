package Demo;

import java.io.FileWriter;
import java.io.IOException;

/*
将数据写入到文本文件之中
1.导包
import java.io.FileWriter;
2.创建，构造方法
public FileWriter(String filename);//参数字符串就是文件的名称
FileWriter fw = new FileWriter("file01.txt");
3.使用，成员方法
写数据：public void write(String str);参数就是需要写入文件中的字符串
关闭流：public void close();关闭，释放资源

总结：FileWriter基本使用步骤：创、写、关。
注意事项：
    1. 关闭
    2. 异常
    3.如果文件 不存在，则自动创建
    4.如果文件已经存在，则覆盖写入
    3.如果不希望覆盖写入，想要追加写入，修改参数
      public FileWriter(String str,boolean append);如果第二个参数是True，则追加写入
    6.换行
      window中换行为：\r\n ,这是两个字符
      macOs中换行为：之前为\r,现在为\n
      linux中换行符为：\n
 */
public class DemoFilewrite {
    public static void main(String[] args) throws IOException { //忽略可能出现的异常
        //创建对象
        FileWriter fw = new FileWriter("file01.txt");

        //2.调用write方法
        fw.write("hello world");
        fw.write("\r\n");
        fw.write("java");
        //3.关闭
        fw.close();
    }
}
