package Text;
import java.util.Scanner;
public class Text6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数(1-7):");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("今天星期一,跑步");
                break;
            case 2:
                System.out.println("今天星期二,游泳");
                break;
            case 3:
                System.out.println("今天星期三,慢走");
                break;
            case 4:
                System.out.println("今天星期四,动感单车");
                break;
            case 5:
                System.out.println("今天星期五,拳击");
                break;
            case 6:
                System.out.println("今天星期六,爬山");
                break;
            case 7:
                System.out.println("今天星期日,吃一顿");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
