package arithmeticoperator;

public class arithmeticoperatorDemo3 {
    public static void main(String[] args){
        //字符串相加


        /*当 “+” 操作中出现字符串时，这个 “+” 是字符串连接符，而不是算术运算符了。
        会将前后的数据进行拼接，并产生一个新的字符串。
        连续进行 "+" 操作时，从左到右逐个执行。
        */
        System.out.println(3.7 + "abc");

        System.out.println("abc" + true);

        System.out.println('中' + "abc" + true);

        int age = 18;
        System.out.println("我的年龄是" + age + "岁");
        System.out.println("我的年龄是" + "age" + "岁");

        System.out.println(1 + 2 + "abc"+ 2 + 1);

    }
}
