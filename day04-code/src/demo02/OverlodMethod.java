package demo02;
/*
方法的重载（OverLoad）:多个方法的名称一样，但是参数列表不一样
注意：
    1.参数个数不同
    2.参数类型不同
    3.参数类型的顺序不同
 */
public class OverlodMethod {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));

    }
    public static int sum(int a,int b)
    {
        System.out.println("两个数相加");
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        System.out.println("三个数相加");
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d)
    {
        System.out.println("四个数相加");
        return a+b+c+d;
    }

}
