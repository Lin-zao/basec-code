package test;
import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        int[] arr = {2, 588 , 888, 1000, 10000};
        int[] newArr = new int[arr.length];
        Random r = new Random();

        for (int i = 0; i < newArr.length; ) {
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            // 如果newArr里面不包含prize，才存入
            if(!contains(newArr,prize)){
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + "元的奖金被抽出");
        }
    }

    /**
     * 判断数组中是否包含指定数字
     * @param arr 目标数组
     * @param prize 需要查找的值
     * @return true代表存在，false代表不存在
     */
    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true; //找到重复，返回存在
            }
        }
        return false; //循环结束没找到，返回不存在
    }
}
