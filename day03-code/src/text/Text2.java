package text;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己衣服时髦度:");
        double my_fashion = sc.nextInt();
        System.out.println("请输入相亲对象衣服时髦度:");
        double girl = sc.nextInt();

        boolean result = my_fashion > girl;

        System.out.println(result);

    }
}
