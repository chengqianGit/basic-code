package day01;
/*
匹配，使用matches方法，返回一个boolean类型
 */
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b ;
        String str = sc.next();
        String regex = "^[1][3578][0-9]{9}";//匹配手机号
        String regex1 ="\\d{17}\\w?";
        b = str.matches(regex1);
        System.out.println(b);

    }
}
