package Demo01;

/*
字符串的内容不可改变，字符串是常量

public int length(); 获得字符串的长度
public String concat(String str); 将当前字符串和参数字符串拼接成新的字符串
public char charAt(int index); 获取指定索引位置的单个字符。
public indexOf(String str); 查找单个字符在字符串的首次出现的索引，没有就返回-1。
public String substring(int index); 截取从参数位置到末尾，返回新的字符串
public String substring(int begin,int end); 截取从开始到结束，包含左边，不包含右边
    转换相关的方法：
public char[] toCharArray(); 将字符串拆分为字符数组
public byte[]  getBytes(); 获取字符串的字节数组
public String replace(CharSequence oldChar,CharSequence newChar); 将所有出现的老字符串转换为新的字符串，
返回替换之后的新字符串
    分割字符串的方法：
public String[] split(String regex); 按照参数的规则切割(正则表达式)（英文的"."句点无法作为参数，可以写成“\\.”）

 */
public class Demo04StringGet {
    public static void main(String[] args) {
        String str1 = "how do you do";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===========");

        String str3 = "aaa,bbb,ccc";
        String[] strArray = str3.split(",");
        System.out.println(strArray);//[Ljava.lang.String;@282ba1e
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("===========");
        String str4 = "aaa.bbb.ccc";
        String[] str5 = str4.split(".");
        System.out.println(str5.length);//0
        String[] str6 = str4.split("\\.");
        System.out.println(str6.length);



    }
}
