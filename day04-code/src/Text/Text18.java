package Text;
import java.util.Scanner;

public class Text18 {
    public static void main(String[] args) {
        //让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次录入三个整数:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4;
        if(number1 > number2){
            number4 = number2;
        }else{
            number4 = number1;
        }
        if(number4 > number3){
            System.out.println("三个数中的最小值为:" + number3);
        }else{
            System.out.println("三个数中的最小值为:" + number4);
        }
    }
}
