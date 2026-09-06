package Text;

/*某商场购物可以打折，具体规则如下：
普通顾客购不满100元不打折，满100元打9折；
会员购物不满200元打8折，满200元打7.5折；
不同打折规则不累加计算。
请根据此优惠计划进行购物结算，
键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。*/
import java.util.Scanner;

public class Text20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入顾客的类别(0表示普通顾客，1表示会员):");
        int category = sc.nextInt();
        System.out.println("请录入购物的折前金额:");
        double money = sc.nextInt();
        double total;
        if(category == 0){
            if(money < 100){
                total = money;
                System.out.println("应付金额为:" + total);
            }else{
                total = money * 0.9;
                System.out.println("应付金额为:" + total);
            }
        }else if(category == 1){
            if(money < 200){
                total = money * 0.8;
                System.out.println("应付金额为:" + total);
            }else{
                total = money * 0.75;
                System.out.println("应付金额为:" + total);
            }
        }else{
            System.out.println("输入类别不正确!");
        }


    }
}
