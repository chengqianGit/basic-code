package Demo02;
/*
new 关键字实际上调用了类里面的构造方法
 */
public class Demo01Student {
    public static void main(String[] args) {
        student stu=new student();
        student stu2=new student("cheng");
        System.out.println(stu2.getName());
        stu.setName("li");
        stu.sayHi("wang");
        System.out.println(stu);//Demo02.student@1e643faf，可以使用这种方法的到类的（导包时用到）的路径
    }

}
