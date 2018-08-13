package Demo02;
/*
数组元素反转
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array={10,15,6,100,89,50,40,60};
        int min=0;
        int max=array.length-1;
        int temp;
        while(min<max)
        {
            temp=array[min];
            array[min]=array[max];
            array[max]=temp;
            min++;
            max--;
        }
        for (int i = 0; i <array.length ; i++)
        {
            System.out.println(array[i]);
        }
    }
}
