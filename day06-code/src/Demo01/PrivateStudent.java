package Demo01;
/*
使用private关键字修饰的成员变量
注意：
      1.setXxx( param );有参数，无返回值
      2.getXxx();无参数，有返回值
      3.boolean类型的不是getXxx(),而是isXxx()
 */
public class PrivateStudent {
    private String name;
    private int age;
    private boolean male;

    public void setName(String str)
    {
        name = str;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int n)
    {
        age=n;
    }
    public int getAge()
    {
        return age;
    }

    public void setMale(boolean b)
    {
        male=b;
    }
    public boolean isMale()//boolean类型的不是getXxx(),而是isXxx()
    {
        return male;
    }
}
