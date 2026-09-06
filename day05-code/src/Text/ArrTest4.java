package Text;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组求最大值:33,5,40,50,60

        int [] arr = {33,5,40,50,60};

        //临时认为0索引的数据是最大的
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
