package Demo03;
/*
继承中的构造方法：
  1.父类构造方法先执行，子类后执行(有”父“后有”子“)
      子类构造方法中有一个默认的”super()"调用
  2.可以使用super关键字，来调用父类重载构造
  3.super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次父类构造
 总结：
     子类必须调用父类的构造方法，不写则赠送super(),写了就使用指定的super调用，super()字能有一个，而且必须是第一个

 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
