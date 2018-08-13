package Demo01;
/*
匿名对象:只有右边的对象，没有左边的名字和赋值运算符
new 类名称（）；
匿名对象只能使用唯一一次，下次不得不再次创建
建议：如果确定一个对象只使用唯一的一次，就可以匿名对象
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name="li";
        one.showName();
        System.out.println("===============");

        //匿名对象
        new Person().name="wang";
        new Person().showName(); //结果为null




    }
}
