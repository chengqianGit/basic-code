package Demo02;

/*
对于ArrayList<>来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合中的所有元素，全都是统一的类型
注意：泛型只能是引用类型，不能是基本类型
            对于ArrayList集合来说，直接打印不是地址值，而是内容
            如果内容为空，得到中括号
 */

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list); //得到的结果为空，并不是地址值，而是内容

        list.add("li");
        list.add("wang");
        System.out.println(list);

    }
}
