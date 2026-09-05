package ifdemo;
import java.util.Scanner;
public class IfDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入身上的钱:");
        int money = sc.nextInt();
        if(money > 100){
            System.out.println("吃网红餐厅");
        }else {
            System.out.println("吃沙县小吃");
        }

    }
}
