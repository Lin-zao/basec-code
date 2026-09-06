package Text;

public class ArrTest12 {
    public static void main(String[] args) {
        //定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
        // 计算并输出学生的平均成绩。
        int [] arr = new int[]{72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        double avg = (double)sum / arr.length;
        System.out.println("平均值为:" + avg);

    }
}
