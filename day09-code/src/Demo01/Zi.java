package Demo01;
/*
三种变量重名
  局部变量                          直接写变量名
  本类的成员变量            this.成员变量名
  父类的成员变量            super.变量名
 */
public class Zi  extends Fu{
    int num = 20;

    public void m()
    {
        int num = 30;
        System.out.println(num); // 30
        System.out.println(this.num); // 20
        System.out.println(super.num); // 10
    }
}
