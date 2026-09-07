package test;

public class Test5 {
    public static void main(String[] args) {
        int [] arr = {11,13,12,16,19};
        printArr(arr);

        /*System.out.println("ABC");//先打印ABC,再进行换行
        System.out.print("ABC");//只打印ABC,不换行
        System.out.println();//不打印任何数据,只进行换行处理*/

    }
    //定义方法用于数组的遍历
    //1.我要干嘛? 遍历数组
    //2.我干这件事需要什么才能完成? 数组
    //3.方法的调用处是否需要继续使用结果
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + " , ");
            }
        }
        System.out.println("]");
    }
}
