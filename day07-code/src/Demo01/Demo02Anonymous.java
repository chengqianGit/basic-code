package Demo01;

import java.util.Scanner;

/*
使用匿名对象作为函数参数
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //普通方式
        int num = sc.nextInt();

        //匿名对象的方式
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("输入的数为：" + num1);

        //匿名对象的方式
        methodParam(new Scanner(System.in));

        Scanner sc1 = methodReturn();
    }

    public static void methodParam(Scanner sc) {
        int num2 = sc.nextInt();
    }
    public static Scanner methodReturn()
    {
        return new Scanner(System.in);
    }
}
