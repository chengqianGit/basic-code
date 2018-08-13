package demo02;
/*
定义一个两个int数字相加的方法
注意事项：
    1.方法不能嵌套定义（但是可以在方法的定义中调用同一个方法，称为递归）
    2.一个方法中可以有多个return语句，但必须保证同时只有一个会被执行到
 */
public class MethodDefine
{
    public static void main(String[] args) {
        int sum=add(1,2);
        System.out.println("结果为："+sum);
    }

    public static int add(int a,int b)
    {
        int c;
        c=a+b;
        return c;
    }
}
