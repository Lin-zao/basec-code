package Text;

import java.util.Scanner;

public class ArrTest13 {
    public static void main(String[] args) {
        //有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
        // 再通过键盘录入一个整数数字。
        // 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
        // 执行效果如下：请输入一个整数数字：50
        //生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
        int [] arr = {12,14,23,45,66,68,70,77,90,91};
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字:");
        int number = sc.nextInt();
        int index = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(number < arr[i]){
                index = i;
                break;
            }

        }
        int [] newArr = new int[11];
        for (int i = 0; i < newArr.length; i++) {
            if(i < index){
                newArr[i] = arr[i];
            }else if(i == index){
                newArr[i] = number;
            }else{
                newArr[i] = arr[i-1];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}
