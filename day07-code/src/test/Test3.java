package test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*- 定义方法实现随机产生一个 5 位的验证码
        验证码格式：
        1. 长度为 5
        2. 前四位是大写字母或者小写字母
        3. 最后一位是数字*/

        //分析:
        ////A-Z,a-z
        //方法:
        //以后如果我们要在一堆没有什么规律的数据中随机抽取
        //可以把这些数据放在数组中
        //再随机抽取一个索引

        //1.把大写字母和小写字母放在数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                //添加小写字母
                chs[i] = (char)(97 + i);
            }else{
                //添加大写字母
                chs[i] = (char)(65 + i -26);
            }
        }


        //2.随机抽取四次
        //定义一个字符串类型的变量,记录最早的结果
        String result = "";
        Random r = new Random();
        for(int i =0;i < 4;i++){
            int randomIndex = r.nextInt(chs.length);
            //System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];

        }

        //3.随机抽取一次数字(1-9)
        int num = r.nextInt(10);
        result = result + num;
        System.out.println(result);



    }
}
