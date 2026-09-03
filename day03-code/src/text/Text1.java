package text;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args){
        //键盘录入一个三位数,获取其中的个位.十位,百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();

        //个位
        int ge = number % 10;
        int shi = number / 10 % 10;
        int ba = number /100 % 10;
        System.out.println("个位为:" + ge);
        System.out.println("十位为:" + shi);
        System.out.println("百位为:" + ba);


    }
}
