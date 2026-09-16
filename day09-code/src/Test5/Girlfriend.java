package Test5;


/*定义数组存储 4 个女朋友的对象
女朋友的属性：姓名、年龄、性别、爱好
要求 1：计算出四个女朋友的平均年龄
要求 2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。*/
public class Girlfriend {
    private String name;
    private int age;
    private String gender;
    private String love;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age, String gender, String love) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }
}
