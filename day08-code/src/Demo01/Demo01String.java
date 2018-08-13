package Demo01;
/*
Java.long.String类代表字符串
字符串效果上相当于char[]字符数组，都是string类的对象
所有双引号里面的都是字符串
创建字符串的3+1中方式：三种构造方法，一种直接创建
    1.public String (); 空白字符串，不含有任何内容
    2.public String(char[] array); 根据字符数组的内容创建字符串
    3.public String(byte[] array); 根据字节数组的内容创建字符串
 */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        char[] array = {'A','B','C'};
        String str2 = new String(array);
        System.out.println("第二个字符串："+str2);
    }
}
