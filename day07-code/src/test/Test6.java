package test;

import java.lang.annotation.Retention;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*某系统的数字密码（大于 0），比如 1983，采用加密方式进行传输。
        规则如下：
        先把整数上的每一位都添加到数组中
        再得到每位数，然后每位数都加上 5，再对 10 求余，最后将所有数字反转，得到一串新数。*/
        //1.先获取整数的长度
        int number = 1983;
        int temp = number;
        int count = 0;
        while(number!= 0){
            number = number /10;
            count++;
        }
        //2.定义动态化数组
        int[] arr = new int[count];

        //3.将整数上的每一位数放进数组
        int index = arr.length - 1;//12345
        while(temp!=0){
            //获取个位上的数字
            int ge = temp % 10;
            //除去最右边的数
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        System.out.println("原始数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        //得到每位数,然后每位数加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        System.out.print("每位数加5之后的数组:" );
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        System.out.println("每位数对10求余后的数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //反转
        for (int i = 0,j = arr.length -1; i < j; i++,j--) {
            int num;
            num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
        }
        System.out.println("反转之后的数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println();
        System.out.println("最终结果为:" + '\n' + num);
    }
}

