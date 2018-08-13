package wangyi_bishi;
import java.util.Scanner;
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i <T ; i++) {
            boolean b= false;
            String str =sc.next();
            if(str.length()<8){
                System.out.println("no");
                b=true;
                continue;
            }
            if(str.contains("password")||str.contains("admin")||str.contains("qwert")||str.contains("hello")||
                    str.contains("iloveyou")||str.contains("112233")){
                System.out.println("no");
                b=true;
                continue;
            }
            char[] chars = str.toCharArray();
            int A=0,a=0,num=0,ch=0;
            for (int j = 0; j <chars.length ; j++) {
                int temp =chars[j];
                System.out.println(temp);
            }
        }
    }
}
