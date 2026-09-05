package Text;
import java.util.Scanner;
public class Text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入实际支付的钱:");
        double money = sc.nextInt();
        if(money >= 600){
            System.out.println("支付成功");
        }else {
            System.out.println("支付失败");
        }

    }
}
