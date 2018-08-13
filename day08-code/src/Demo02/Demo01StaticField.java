package Demo02;
/*
一旦使用了static关键字，那么这个变量不在属于对象自己，而是属于所在的类，由类的对象共享
静态方法：
    如果没有static关键字，则必须要先创建对象，通过对象才能使用
    如果由static关键字，那么不需要创建对象，使用类名直接调用；
无论是静态变量还是静态方法，都推荐使用类名称进行调用
    类名称.静态变量
    类名称.静态方法

注意事项：
    1.静态不能直接访问非静态
    原因：内存中【先】有的静态，【后】有的非静态
    2.静态方法中不能使用this
    原因：this代表当前对象
 */

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("li",18);
        one.room = "101";
        Student two = new Student("wang",19);
        System.out.println(one.getName()+one.getAge()+one.getId());
        System.out.println(two.getName()+two.getAge()+two.getId());
    }
}
