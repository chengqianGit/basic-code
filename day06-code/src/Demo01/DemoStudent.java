package Demo01;
/*
类的使用
1.导包
    import 包名.类名
    import Demo01.Student
    对于和当前类在同一个包下的，可以省略import语句
2.创建
    类名称 对象名 = new 类名称（）；
    Student stu=new Student();
3.使用
    分为两种情况：
    1.使用成员变量：对象名.成员变量
    1.使用成员方法：对象名.成员方法 （）
 */
public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.age);//默认值为0
        System.out.println(stu.name);//默认值为null
        stu.name="Li";
        stu.age=22;

        System.out.println(stu.age);//22
        System.out.println(stu.name);//"Li"

        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println("=========");

        Student stu2 = stu;
        stu2.age=66;
        System.out.println(stu2.age);//66

        System.out.println(stu.age);//66********传递的是引用（在内存中的地址值）


    }
}
