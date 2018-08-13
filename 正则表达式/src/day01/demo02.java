package day01;
/*
切割：使用splite函数，返回字符串数组
 */
public class demo02 {
    public static void main(String[] args) {
        String str = "1 2   6   5   4           4/78/64-88---84";
        String regex = "\\ +|\\/|\\-+";
        String[] strList = str.split(regex);
        for (int i = 0; i < strList.length; i++) {
            System.out.println(strList[i]);
        }
    }
}
