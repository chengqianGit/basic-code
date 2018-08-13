package Demo04;
/*
抽象方法：abstract 去掉大括号，直接分号结束
抽象类：抽象方法所在的类，必须是抽象类，加上abstract

如何使用：
    1.无法直接new创建一个抽象类的对象
    2.必须用一个子类继承抽象父类
    3.子类必须覆盖重写抽象父类中的抽象方法：去掉abstract关键字，补上方法体
    4.创建子类对象进行使用
 */
public  abstract class Animal {
    //这是一个抽象方法
    public  abstract void eat();
    //普通的成员方法
    public void nomal()
    {

    }

}
