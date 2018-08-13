package Demo02;

public class ArrayOne {
    public static void main(String[] args) {
        int[] array01=new int[3];//这里的赋值，是将数组new开辟的堆内存地址赋给array01
        System.out.println(array01);//内存地址值
        System.out.println(array01[0]);//默认值
        System.out.println("============");

        //改变数组中元素的内容
        array01[1]=10;
        array01[2]=20;
        System.out.println(array01[0]);
        System.out.println(array01[1]);
        System.out.println(array01[2]);
        System.out.println("============");
        int[] array02=array01;//这里还是将将数组new开辟的堆内存地址赋给array02
        array02[1]=100;
        System.out.println(array01[1]);//由于是在堆（Head）的同一个地址，所以改变地址中的值同样会对第一个数组array01产生影响
        System.out.println(array02[1]);

    }
}
