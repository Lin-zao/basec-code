package Text;
/*键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。*/
import java.util.Scanner;
public class Text22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();
        int min,max;
        if(num1 > num2){
            min = num2;
            max = num1;
        }else if(num1 < num2){
            min = num1;
            max = num2;
        }else{
            min = num1;
            max = num2;
        }
        int total = 0;
        for(;min <= max;min++){
            total +=min;
        }
        System.out.println(total);
    }
}
