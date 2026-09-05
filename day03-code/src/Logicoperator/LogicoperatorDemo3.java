package Logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args){
        // 1.&&
        //运行结果跟单个&是一样的
        //表示两边都为真,结果才为真
        System.out.println(true && true);
        System.out.println(false && true);

        //2.||
        //运行结果跟单个|是一样的
        //表示两边都为假,结果才为假
        System.out.println(true || true);
        System.out.println(false || true);

        /*短路逻辑运算符具有短路效果
        当左边表达式能确定最终的结果,那么右边就不会参与运算*/
         int a = 10;
         int b = 10;
         boolean result = ++a < 5 && ++b <10;
         System.out.println(result);
         System.out.println(a);
         System.out.println(b);
    }
}
