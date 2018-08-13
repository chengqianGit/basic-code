package wangyi06;

import java.util.Arrays;
import java.util.HashSet;

public class hashTest {
    public static void main(String[] args) {
        String str1 = "asdfghjkl";
        String str2 = "aqwer";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        HashSet<String> set = new HashSet<>(Arrays.asList(str1));
        set.retainAll(Arrays.asList(str2));
        if(set.size()>0){
            System.out.println("you相同");
        }else{
            System.out.println("meiyouxiang同");
        }

        String[] strOne= {"c","b","a","d"};
        String[] strTwo= {"w","e","r","t"};
        HashSet<String> set1 = new HashSet<>(Arrays.asList(strOne));
        set1.retainAll(Arrays.asList(strTwo));
        if(set1.size() > 0){
            System.out.println("有相同");
             }else
        {
            System.out.println("没有相同");
        }
    }
}
