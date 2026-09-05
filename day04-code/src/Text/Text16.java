package Text;

public class Text16 {
    public static void main(String[] args) {
        /*需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围） 。
        将两数相除，要求不使用乘法、除法和 % 运算符。
        得到商和余数。

        分析：
            被除数 / 除数 = 商 ... 余数

        int a = 100;
        int b = 10;

        100 - 10 = 90
        90 - 10 = 80
        80 - 10 = 70
        70 - 10 = 60
        ...
        10 - 10 = 0 (余数)

        */

        //1.定义变量记录被除数
        int dividend = 100;
        //2.定义变量记录除数
        int divisor = 10;
        //3.定义变量记录循环次数,也就是商
        int count = 0;
        //不知道循环多少次,用while
        while(dividend >= divisor){
            dividend = dividend -divisor;
            count ++;

        }
        System.out.println("余数为:" + dividend);
        System.out.println("商为:" + count);
    }
}
