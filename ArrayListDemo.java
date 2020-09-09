import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setTeacher("张三", 25);
        t1.getTeacherName();
        t1.getTeacherAge();
        Teacher t2 = new Teacher();
        t2.setTeacher("李四", 35);
        t2.getTeacherName();
        t2.getTeacherAge();
        Teacher t3 = new Teacher();
        t3.setTeacher("老王", 19);
        t3.getTeacherName();
        t3.getTeacherAge();
        Teacher t4 = new Teacher();
        t4.setTeacher("赵六", 29);
        t4.getTeacherName();
        t4.getTeacherAge();
        // ArrayList String 类型来存储 name
        ArrayList <String>name = new ArrayList<>();
        name.add(t1.getTeacherName());
        name.add(t2.getTeacherName());
        name.add(t3.getTeacherName());
        name.add(t4.getTeacherName());
        // ArrayList Integer 类型来存储 age
        ArrayList <Integer>age = new ArrayList<>();
        age.add(t1.getTeacherAge());
        age.add(t2.getTeacherAge());
        age.add(t3.getTeacherAge());
        age.add(t4.getTeacherAge());
        // 增强for循环
        for(String n : name){
            System.out.println("教师姓名为： "+n);
        }
        for(int a : age){
            System.out.println("年龄为： "+a);
        }
        // 普通for循环
        for(int i=0;i<name.size();i++){
            System.out.println("教师姓名为： "+name.get(i));
        }
        double agep = 0;
        int sum = 0;
        for(int j=0;j<age.size();j++){
            System.out.println("年龄为： "+age.get(j));
            sum += age.get(j);
        }
        agep = sum/age.size();
        System.out.println("教师的平均年龄为: "+agep);

    }
}
