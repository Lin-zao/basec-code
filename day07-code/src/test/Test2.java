package test;

public class Test2 {
    public static void main(String[] args) {
        //101-200有多少个质数,并打印所有质数
        int count = 0;
        //外循环:遍历101-200这个范围,依次得到这个范围之内的每一个数字
        for(int i = 101;i <=200;i++){
            boolean result = true;
            //内循环:判断当前数字是否为一个质数
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    result = false;
                    break;
                }
            }if(result){
                System.out.println(i + "是质数");
                count++;
            }
        }
        System.out.println("一共有"+count+"个质数");

    }
}
