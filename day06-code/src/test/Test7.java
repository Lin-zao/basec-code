package test;

public class Test7 {
    public static void main(String[] args) {
        //顶一个一个方法判断数组中的某一个数是否存在,
        //将结果返回给调用处
        int[] arr = {12,9,23,23,45,67,87,65};
        boolean result = contain(arr,10);
        System.out.println(result);
    }
    public static boolean contain(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }

        }
        return false;

    }
}
