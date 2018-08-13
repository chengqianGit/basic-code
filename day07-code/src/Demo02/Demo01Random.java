package Demo02;

import java.util.Random;

/*
用来生成随机数
    1.。nextInt();括号内没有参数时，表示完全随机的数字，不加限制
    1..nextInt();有参数时，可以加以限制;；参数代表了范围，左闭右开区间
    nextInt(3),表示取数范围为[0,3);

 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);

        System.out.println("============");
        int num2 = r.nextInt( 3);
        System.out.println(num2);
    }
}
