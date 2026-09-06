package Text;
import java.util.Scanner;
public class loopText3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数 x ，判断该整数是否为一个质数。

        //质数：
        //如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数
        //7 = 1 * 7 质数
        //8 = 1 * 8  2 * 4 合数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数:");
        int x = sc.nextInt();
        boolean flag = true;
        for(int i = 2;i < x;i++){
            if(x % i == 0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println(x + "是一个质数");
        }else{
            System.out.println(x + "不是一个质数");
        }

    }
}
