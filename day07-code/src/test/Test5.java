package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*在唱歌比赛中，有 6 名评委给选手打分，分数范围是 [0 - 100] 之间的整数。
        选手的最后得分为：去掉最高分、最低分后的 4 个评委的平均分，
        请完成上述过程并计算出选手的得分。*/
        //1.定义一个数组,获取评委的打分
        double[] scoreArr = getScores();

        //2.获取最大值
        double max = scoreMax(scoreArr);

        //3.获取最小值'
        double min = scoreMin(scoreArr);

        //4.求和
        double total = getSum(scoreArr);

        //5.
        double sum = (total - max - min)/(scoreArr.length - 2);
        System.out.println("选手最终结果为:" + sum);




    }
    public static double scoreMax(double[] scoreArr){
        double max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }
    public static double scoreMin(double[] scoreArr){
        double min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] > min){
                min = scoreArr[i];
            }
        }
        return min;
    }
    public static double getSum(double[] scoreArr){
        double total = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            total += scoreArr[i];
        }
        return total;

    }
    public static double[] getScores() {
        double[] scoreArr = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scoreArr.length; ) {
            System.out.println("请输入评委的打分(0-100):");
            double score = sc.nextDouble();
            if (score >= 0 && score <= 100) {
                scoreArr[i] = score;
                i++;
            } else {
                System.out.println("输入错误,请重新输入");
            }
        }
        return scoreArr;
    }
    }
