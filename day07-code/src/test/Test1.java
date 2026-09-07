package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*需求：
        ● 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        ● 按照如下规则计算机票价格：旺季（5‑10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        */
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入机票的原价:");
            double price = sc.nextDouble();
            System.out.println("请输入月份(1-12):");
            int month = sc.nextInt();
            System.out.println("请选择舱型(0-头等舱/1-经济舱):");
            int cabin = sc.nextInt();
            if(month >= 5 && month <=10){
                price = getPrice(price,cabin,0.9,0.75);

            }else if((month >= 1 && month <5) || (month >=11 && month <=12)){
                price = getPrice(price,cabin,0.8,0.65);
            }else{
                System.out.println("输入月份有误,请重新输入");
                continue;
            }
            if(price == -1){
                continue;
            }
            System.out.println("机票最终价格为:" + price);
        }
    }


    public static double getPrice(double price,int cabin,double v0,double v1){
            if (cabin == 0) {
                price = price * v0;
            } else if (cabin == 1) {
                price = price *v1;
            }else{
                System.out.println("输入舱型有误");
                return -1;
            }
            return price;
    }
}
