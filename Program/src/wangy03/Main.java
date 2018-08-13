package wangy03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            //int[] array = new int[n];
            List<Integer> intList = new ArrayList<>();
            //循环得到某一组会话列表
            //将第一个数字加入到列表中
            intList.add(sc.nextInt());
            for(int j=1;j<n;j++){

                int m = sc.nextInt();
                int k = intList.indexOf(m);
                //如果已经包含在列表当中，则先将该数字加到列表的末尾，并把之前存在的那个数字删除
                if(k!=-1){
                    //int temp = intList.get(intList.size()-1);
                    //intList.set(intList.size()-1,m);
                    //intList.set(n,temp);
                    intList.add(m);
                    intList.remove(k);
                }else{//如果不包含，则直接添加到列表中
                    intList.add(m);
                }
            }
            for(int j=intList.size()-1;j>=0;j--){
                if(j==0){
                    System.out.print(intList.get(j));
                }else{
                    System.out.print(intList.get(j)+" ");
                }

            }
        }
    }
}
