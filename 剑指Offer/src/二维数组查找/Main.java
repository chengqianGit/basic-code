package 二维数组查找;

import java.util.Scanner;

/*
在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组array和一个整数number，判断数组中是否含有该整数
思路：
    1.因为数组有序，从右上角（左下角）开始，
    2.若大于number,则整列排除；回步骤1  ||若小于number，则整行排除；回步骤1

    4.找到number，或结束
 */
public class Main {
    public static void main(String[] args) {
        int[][] array={{1,2,8,9},
                                 {2,4,9,12},
                                 {4,7,10,13},
                                 {6,8,11,15}};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = judge(array,n);
        System.out.println(b);
    }
    public static boolean judge(int[][] array,int number){
        boolean b =false;
        int row =0;
        int colum =array[0].length-1;
        while(colum>=0&&row<=array.length-1){//当满足条件时循环
            if(array[row][colum]>number){
                colum--;
                continue;
            }else if(array[row][colum]<number){
                row++;
                continue;
            }else{
                b=true;
                break;
            }
        }


        return b;
    }
}
