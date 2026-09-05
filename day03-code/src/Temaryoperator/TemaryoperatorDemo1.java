package Temaryoperator;

public class TemaryoperatorDemo1 {
    public static void main(String[] args) {
        // 使用三元运算符,获取两个数的较大值

        int number1 = 10;
        int number2 = 30;

        //使用三元运算符获取两个整数的较大值
        // 格式: 关系表达式 ? 表达式1:表达式2;
        //整个三元运算符的结果必须要被使用

        int result = number1 > number2 ? number1 : number2;
        System.out.println("较大值为:");
        System.out.println(result);

    }
}
