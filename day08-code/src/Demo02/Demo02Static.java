package Demo02;
/*
静态代码块：
public class 类名称{
  static {
       //静态内容
  }
}
特点：当第一次使用本类时，静态代码块执行唯一一次
               静态总是优先于非静态，静态代码块比构造方法先执行
用途：用来一次性的对静态内容进行赋值
 */
public class Demo02Static {
    public static void main(String[] args) {
        Person one = new Person();
    }
}
