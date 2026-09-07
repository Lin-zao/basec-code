package test;

public class Test1 {
    public static void main(String[] args) {
        //定义一个方法,求长方形的周长,将结果打印出来
        getLength(5.2,1.3);

    }
    public static void getLength(double len,double width){
        double result = (len + width)*2;
        System.out.println(result);
    }
}
