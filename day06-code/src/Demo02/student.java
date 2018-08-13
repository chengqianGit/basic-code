package Demo02;
/*
当方法的成员变量跟局部变量重名时，根据“就近原则”，优先使用局部变量
如果需要访问本类中的成员变量，需要用 "this " 关键字
this.成员变量
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
构造方法：
    1.构造方法的名称与类名完全一样，就连大小写都一样
    2.构造方法没有返回值类型，也不需要写void
    3.构造方法没有返回值
    4.构造方法可以重载
 */
public class student {
    private String name;

    public student()
    {
        System.out.println("无参构造方法执行了");

    }
    public student(String name)
    {
        System.out.println("有参构造方法执行了");
        this.name=name;//功能上等同于setXxx()方法
    }
    public void setName(String str)
    {
        name=str;
    }

    public String getName()
    {
        return name ;
    }

    public void sayHi(String name)
    {
        System.out.println(name+"你好，我是"+this.name);
    }
}
