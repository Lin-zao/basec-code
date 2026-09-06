package Text;
import java.util.Scanner;
public class Text19 {
    public static void main(String[] args) {
        /*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。
        存款年利率表如下：
        存期		年利率（%）

        一年		2.25

        两年		2.7

        三年		3.25

        五年		3.6

        请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。

        提示：

        存入金额和存入年限均由键盘录入

        本息计算方式：本金+本金×年利率×年限*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入金额:");
        double money = sc.nextInt();
        System.out.println("请输入存入年限:");
        int year = sc.nextInt();
        double self = 0;
        if (year == 1) {
            self = money + money * 0.0225 * 1;
            System.out.println("存入一年的本息为:" + self);
        } else if (year == 2) {
            self = money + money * 0.027 * 2;
            System.out.println("存入两年的本息为:" + self);
        } else if (year == 3) {
            self = money + money *0.0325 * 3;
            System.out.println("存入三年的本息为:" + self);
        } else if (year == 5) {
            self = money + money * 0.036 * 5;
            System.out.println("存入五年的本息为:" + self);
        }else{
            System.out.println("年限输入错误");
        }
    }
}