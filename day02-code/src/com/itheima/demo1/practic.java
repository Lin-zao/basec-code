package com.itheima.demo1;

public class practic {
    public static void main(String[] args){
        /*请用代码描述下列银行流水变化过程：

    1. 小明账户bankBalance初始值有500.00元
    2. 存入250元
    3. 支出100元
    4. 打印剩余存款*/
       double bankBalance = 500.0;
       bankBalance += 250;
       bankBalance -=100;
       System.out.println("剩余存款为:");
       System.out.println(bankBalance);
    }
}
