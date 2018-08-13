package 网易02;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0]=0;

        System.out.println(array[1]);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        //int n = integerList.indexOf(5);
        int nn=integerList.remove(1);
        System.out.println(nn);
        for (int i = 0; i <integerList.size() ; i++) {
            System.out.println(integerList.get(i));
        }
        //System.out.println(n);


    }
}
