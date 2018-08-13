package Demo01;

import java.util.Scanner;

/*
获取键盘输入字符串的特定字符的个数：
大写字母，小写字母，数字
char类型可以直接进行比较（在运算过程中会转换为对应的数字）
 */
public class Demo05StringCount {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //System.out.println(str);

        int a=0,b=0,c=0;
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (65<=bytes[i]&&bytes[i]<91)
            {
                a++;
            }
            else if(97<=bytes[i]&&bytes[i]<122)
            {b++;}
            else
                c++;

        }
        System.out.println("大写字母个数为:"+a+"，小写字母个数为:"+b+"，数字个数为:"+c);

    }
}
