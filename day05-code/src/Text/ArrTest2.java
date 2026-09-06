package Text;

public class ArrTest2 {
    public static void main(String[] args) {
        /*定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        * 遍历数组得到的每一个元素,统计数组里面一共有多少能被3整除的数字*/
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println("数组中能被三整除的数有" + count + "个");

    }
}
