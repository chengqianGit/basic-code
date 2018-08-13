package Demo01;

import java.util.List;
import java.util.Scanner;//  1.导包

/*
接收键盘输入的类Scanner
引用类型的使用步骤
    1.导包
    import 包路径.包名称；
    在同一个包下不用引用；
    只有java.long包下不需要import;

    2.创建
    类名称 对象名 = new 类名称（参数列表）；

    3.使用
 */
public class Demo01Scanner {
    public static void main(String[] args) {
//    创建
        Scanner sc= new Scanner(System.in); //System.in固定写法，代表从键盘输入
        int num = sc.nextInt();
        System.out.println(num);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////其实从键盘输入的都看作为字符串接收，然后再转换为相应类型//////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String str = sc.next();
        System.out.println(str);

    }
    private static void fun(List<String> list){

    }

}
