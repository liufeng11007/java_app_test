public class Teacher {
    private String name;
    private int age;

    public void setTeacher(String name, int age){
        this.name = name;
        this.age= age;
    }

    public String getTeacherName(){
//        System.out.println("教师姓名为： "+this.name+" ,年龄为： "+this.age);
        return this.name;
    }

    public int getTeacherAge(){
        return this.age;
    }
}
