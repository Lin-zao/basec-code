package Text;
import java.util.Scanner;
public class Text5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员的等级(1-3):");
        int grade = sc.nextInt();
        System.out.println("商品的价格:");
        int price = sc.nextInt();
        if(grade == 1){
            double total = price * 0.9;
            System.out.println("实际支付的钱为:" + total);
        }else if(grade == 2){
            double total = price * 0.8;
            System.out.println("实际支付的钱为:" + total);
        }else if(grade == 3){
            double total = price * 0.7;
            System.out.println("实际支付的钱为:" + total);
        }else{
            System.out.println("实际支付的钱为:" + price);
        }


    }
}
