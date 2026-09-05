package Text;
import java.util.Scanner;
public class Text4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票的序号:");
        int  ticket = sc.nextInt();
        if(ticket > 0 && ticket <= 100){
            if(ticket % 2 == 0 ){
                System.out.println("坐右边");
            }else{
                System.out.println("坐左边");

            }
        }else {
            System.out.println("输入票的序号有误");
        }
    }
}
