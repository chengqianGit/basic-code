package Demo01;
/*
在继承中，“子类就是一个父类”，例如“讲师”就是一个“员工”
格式：
public class 子类名 extends父类名{
     //code
}
在继承中，如果成员变量重名，则创建子类对象时，访问有两种方式：
    直接通过子类对象访问成员变量：
        等号左边是谁，就优先用谁，没有就向上找（就是往父类找）
     间接通过成员方法访问成员变量：
         方法属于谁，就优先用谁，没有则向上找

 */
public class Demo01Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.m();
    }
}
