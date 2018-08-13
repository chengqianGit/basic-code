package Demo01;

public class Demo04PrivateStudent {
    public static void main(String[] args) {
        PrivateStudent stu=new PrivateStudent();
        String str="李";
        stu.setName(str);
        int n=19;
        stu.setAge(n);
        boolean b=true;
        stu.setMale(b);

        System.out.println("名字为："+stu.getName());
        System.out.println("年龄为："+stu.getAge());
        System.out.println("性别为："+stu.isMale());

    }
}
