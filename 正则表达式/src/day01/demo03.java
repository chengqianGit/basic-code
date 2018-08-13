package day01;
/*
叠词:
 */
public class demo03 {
    public static void main(String[] args) {
        String str1 = "我。。我。我。。喜。喜。欢欢欢";
        String str2 = str1.replaceAll("\\。+","");
        System.out.println(str2);
        String str3 = str2.replaceAll("(.)\\1+","$1");
        System.out.println(str3);
    }
}
