package Test1;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend girl = new GirlFriend();
        //赋值
        girl.setName("lq");
        girl.setAge(-18);
        girl.setGender("女");


        System.out.println(girl.getName());
        System.out.println(girl.getAge());
        System.out.println(girl.getGender());

        girl.eat();
        girl.sleep();

        System.out.println("=============");


    }
}
