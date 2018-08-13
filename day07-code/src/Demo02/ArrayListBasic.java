package Demo02;

import java.util.ArrayList;

/*
泛型只能是引用类型，不能是基本类型
因为集合中存的都是地址值，而基本类型没有地址值
解决方案：如果想放，必须使用基本类型对应的“包装类”
                    基本类型 包装类（都位于java.long包下---不用导包）
                    byte Byte
                    int Integer
                    double Double
                    float Float
从JDK 1.5+开始，支持自动装箱、拆箱
自动装箱--->      基本类型—>包装类型
       拆箱-->        包装类型----基本类型
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list0=new ArrayList<>();
        //错误写法，泛型只能是引用类型
        //ArrayList<int> list1 = new ArrayList<int>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        System.out.println(list2);
    }
}
