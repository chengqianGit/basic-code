package Demo02;
/*
求出数组当中的最大值
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] array=new int[]{5,15,20,30,50,40};
        int max=0;
        for (int i = 0; i <array.length ; i++) {
            if(max<=array[i])
            {
                max=array[i];
            }
        }
        System.out.println("数组中最大的数为："+max);
    }
}
