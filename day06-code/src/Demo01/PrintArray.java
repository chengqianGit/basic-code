package Demo01;

import java.util.Arrays;

/*
面向过程：所有过程都要亲历亲为
面向对象：不关心具体步骤，找一个具有该功能的对象来完成
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};

        //要求打印格式为[10,20,30,40,50]

        //面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1)
                System.out.println(array[i]+"]");
            else
                System.out.print(array[i]+",");
        }
        System.out.println("==============");

        //面向对象
        System.out.println(Arrays.toString(array));

    }


}
