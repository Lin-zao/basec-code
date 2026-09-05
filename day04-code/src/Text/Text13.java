package Text;

import java.util.Scanner;
public class Text13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数表示范围的开始:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数表示范围的结束:");
        int number2 = sc.nextInt();
        int total = 0;
        for(int i = number1;i <= number2;i++){
            if(i % 3 ==0 && i % 5 ==0){
                total += 1;
            }
        }
        System.out.println("既能被3整除,又能被5整除的数有:" + total +"个");



    }
}
