package Test3;

import java.util.Scanner;
/*定义数组存储 3 部汽车对象。
汽车的属性：品牌，价格，颜色。
创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。*/
public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入汽车的品牌:");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车的价格:");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车的颜色:");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组中
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + " ," + car.getPrice() + " ,"  + car.getColor());
        }
    }
}
