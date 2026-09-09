package test;

public class Test7 {
    public static void main(String[] args) {
        //把整数上的每一位都添加到数组中

        //1.计算出数组的长度
        int number =12345;
        int temp = number;
        int count = 0;
        while(number != 0){
            number = number / 10;
            count++;
        }
        //动态初始化
        int[] arr =new int[count];
        int index = arr.length -1;
        //把整数上的每一位都添加到数组中
        while(temp != 0){
            //获取temp里面的每一数组
            int ge =temp % 10;
            //再去掉右边那位
            temp = temp/10;
            //把当前获取的个位添加到数组中
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
