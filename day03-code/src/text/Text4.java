package text;

import java.util.Scanner;
public class Text4 {
    public static void main(String[] args) {
        // 判断两只老虎体重是否相同
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重(kg):");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重(kg):");
        int weight2 = sc.nextInt();
        String result = weight1 == weight2 ? "相同" : "不同";
        System.out.println("两只老虎的体重:");
        System.out.println(result);



    }
}
