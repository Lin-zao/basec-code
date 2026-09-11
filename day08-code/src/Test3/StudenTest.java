package Test3;

public class StudenTest {
    public static void main(String[] args) {
        //创建对象
        //调用空参构造
        //Student s = new Student();
        Student s = new Student("zhangsan",18);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
