package test;

public class Test2 {
    public static void main(String[] args) {
        //定义一个方法,求圆的面积,将结果输出出来
        getArea(9.8);

    }
    public static void getArea(double r){
        double result = 3.14 * r*r;
        System.out.println(result);
    }
}
