package ifdemo;

import java.util.Scanner;
public class IfDemo1 {
    public static void main(String[] args) {
        //if 格式 : if (关系表达式){ 语句体}
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入女婿的酒量:10");
    int wine = sc.nextInt();
    if (wine > 2){
        System.out.println("不错的");
    }
    }
}
