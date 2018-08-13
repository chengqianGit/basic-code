package wangyi06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
字符串、集合操作集合

 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "asd";
        String str2=str1.concat("fgh");
        System.out.println(str2);
        //字符串中某一位置的字符
        char a = str2.charAt(2);
        System.out.println(a);
        //字符串比较
        int i = str1.compareTo(str2);//.equals
        System.out.println(i);
        //获取子字符串
        String str3 = str2.substring(2,4);//从2开始，到4-1结束
        System.out.println(str3);
        //字符串前缀后缀
        String str4="sd";
        boolean b = str2.startsWith(str4,1);
        System.out.println(b);
        boolean bb = str2.endsWith("gh");
        System.out.println(bb);
        //.split
        //集合操作
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        //按索引删除,输入数字，默认按索引
        integerList.remove(1);
        for (int j = 0; j < integerList.size(); j++) {
            System.out.println(integerList.get(j));
        }
        //按内容删除
        Number number = 2;
        //int n = 2;错误写法
        integerList.remove(number);
        for (int j = 0; j < integerList.size(); j++) {
            System.out.println(integerList.get(j));
        }
        integerList.add(1,88);//再“1”的位置出插入
        integerList.set(1,66);
        for (int j = 0; j < integerList.size(); j++) {
            System.out.println(integerList.get(j));
        }
        System.out.println("=================");
        integerList.add(2);
        integerList.add(3);
        //去除重复元素的简单方法        有删除操作不能用for(Integer jj : integerList)循环
//        for(Integer jj : integerList){
//            if(Collections.frequency(integerList,jj)>1){
//                integerList.remove(jj);
//            }
//        }
        //

        //可以使用 ：循环
        for(int n : integerList){
            System.out.println(n);
        }
        for (int j = 0; j < integerList.size(); j++) {
            System.out.println(integerList.get(j));
        }


    }
}
