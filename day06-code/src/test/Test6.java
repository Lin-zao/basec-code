package test;

public class Test6 {
    public static void main(String[] args) {
        //设计一个方法求数组的最大值,并将最大值返回
        int[] arr = {10,12,13,14,19};
        System.out.println(getMax(arr));

    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
