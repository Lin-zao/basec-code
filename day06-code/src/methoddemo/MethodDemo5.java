package methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //掌握带返回值方法的定义和调用格式
        double sum = getSum(10,20,30);
        System.out.println(sum);

    }
    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 +num3;
        return result;

    }
}
