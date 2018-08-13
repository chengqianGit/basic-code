package Demo01;
/*
字符串常量池：凡是双引号创建的，都在字符串常量池当中
基本类型： == 比较的是数值
引用类型： == 比较的是地址值
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str3==str2);//false
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
