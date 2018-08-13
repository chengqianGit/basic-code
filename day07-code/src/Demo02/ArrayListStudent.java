package Demo02;

import java.util.ArrayList;

/*
泛型可以是自定义类型（学生类）
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("li",18);
        Student stu2 = new Student("wang",19);
        Student stu3 = new Student("cheng",20);
        System.out.println(stu1);
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(stu1);
        listStudent.add(stu2);
        listStudent.add(stu3);

        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("第"+i+"个学生姓名为："+listStudent.get(i).getName()+" 年龄为："+listStudent.get(i).getAge());
        }
    }
}
